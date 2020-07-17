package imooclambda;

/**
 * Copyright (C), 2018-2019, copyright info. DAMU., Ltd.
 * FileName: imooclambda App5
 * <p>TODO</p>
 *
@author* @version 1.00
 */
public class App5 {

    public static void main(String[] args) {
        Test t = (msg) -> System.out.println(msg);
        t.test("lambda!");
    }

}
interface Test {
    void test(String msg);
}
