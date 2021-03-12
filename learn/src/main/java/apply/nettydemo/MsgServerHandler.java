package apply.nettydemo;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author tangmaoheng
 * @createTime 2019年12月18日 09:49:00
 */
@ChannelHandler.Sharable
public class MsgServerHandler extends ChannelInboundHandlerAdapter {

    String name ;

    public MsgServerHandler(String name) {
        this.name = name;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String str = (String) msg;
        System.out.println("服务端收到:" + str);
        ctx.writeAndFlush("服务端返回数据:" + RandomStringUtils.randomAlphabetic(10));
        //释放msg
        ReferenceCountUtil.release(msg);
    }
}
