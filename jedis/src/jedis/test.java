package jedis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class test {
    Jedis jedis=new Jedis("192.168.128.129",6379);
    public void test1(){

        String username = jedis.get("username");
        System.out.println(username);
        jedis.set("地址","广州");
        String add = jedis.get("地址");
        System.out.println(add);
        jedis.lpush("a","1","2","3");
        List<String> a = jedis.lrange("a", 0, -1);
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public void add(String key, double score, String member){
        jedis.zadd(key,score,member);
    }
    public  void top(String keys){
        Set<String> sortset = jedis.zrevrange(keys, 0, -1);
        Iterator<String> iterator = sortset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        test test=new test();
      //  test.test1();
        test.add("paiming",100,"xiaojie");
        test.add("paiming",90,"xiaojie1");
        test.add("paiming",80,"xiaojie2");
        test.add("paiming",70,"xiaojie3");


        test.top("paiming");
    }
}
