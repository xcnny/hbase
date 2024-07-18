import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseIOException;
import org.apache.hadoop.hbase.client.AsyncConnection;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hbase.thirdparty.io.netty.util.concurrent.CompleteFuture;

/**
 * @author liubin
 * @create 2024-07-18 17:05
 * @Description:
 */
public class HbaseConnection {
    public static void main(String[] args)  {
        //创建连接配置对象
        Configuration conf = new Configuration();
        //添加配置参数
        conf.set("hbase.zookeeper.quorum","node2,master,node1");
        //创建连接（同步连接）
        Connection hbaseconnec = ConnectionFactory.createConnection(conf);
        //创建异步连接
//        CompletableFuture<AsyncConnection> asyncConnection  = ConnectionFactory.createAsyncConnection(conf);
        //使用连接
        System.out.println(hbaseconnec);
        //关闭连接
        hbaseconnec.close();

    }
}
