package practice.newSpringFramwwork.Service;

public interface ICombinesDatas {
    <T> T getDatas(String json, Class<T> clase);
}
