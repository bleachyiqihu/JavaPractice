package lambda;

/**
 * 谓词接口
 * Created by Administrator on 2017/3/29.
 */
interface Predicate<T> {
    boolean test(T t);
}
