package com.bleachyiqihu.javapractice.algorithm.dp;

import java.util.List;

/**
 * Created by Paul on 2018-12-26
 */
class Package {
    private int maxBurden;
    private int maxWeight = Integer.MIN_VALUE;

    Package(int maxBurden) {
        this.maxBurden = maxBurden;
    }

    int maxWeight(List<Integer> goodsWeightList) {
        if (goodsWeightList == null || goodsWeightList.isEmpty())
            return 0;
        strategy(0, 0, goodsWeightList);
        return maxBurden;
    }

    int dpMaxWeight(List<Integer> goodsWeightList) {
        if (goodsWeightList == null || goodsWeightList.isEmpty())
            return 0;
        boolean[][] state = new boolean[goodsWeightList.size()][maxBurden + 1];
        state[0][0] = true;
        if (goodsWeightList.get(0) <= maxBurden)
            state[0][goodsWeightList.get(0)] = true;
        for (int i = 1; i < goodsWeightList.size(); i++) {
            for (int j = 0; j <= maxBurden; j++)
                if (state[i - 1][j])
                    state[i][j] = true;

            for (int j = 0; j <= maxBurden - goodsWeightList.get(i); j++) {
                if (state[i - 1][j])
                    state[i][j + goodsWeightList.get(i)] = true;

            }
        }
        for (int w = maxBurden; w >= 0; w--) {
            if (state[goodsWeightList.size() - 1][w])
                return w;
        }
        return 0;
    }


    private void strategy(int i, int cw, List<Integer> goodsWeightList) {
        if (i == goodsWeightList.size() || cw == maxBurden)
            if (maxWeight < cw) {
                maxWeight = cw;
                return;
            }
        strategy(i + 1, cw, goodsWeightList);
        if (cw + goodsWeightList.get(i) <= cw)
            strategy(i + 1, cw + goodsWeightList.get(i), goodsWeightList);
    }
}
