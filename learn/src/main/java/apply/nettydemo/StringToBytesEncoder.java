package apply.nettydemo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.StandardCharsets;

/**
 * @author tangmaoheng
 * @createTime 2019年12月18日 09:41:00
 */
@ChannelHandler.Sharable
public class StringToBytesEncoder extends MessageToByteEncoder<String> {
    @Override
    protected void encode(ChannelHandlerContext ctx, String msg, ByteBuf out) throws Exception {
        //编码
        out.writeCharSequence(msg, StandardCharsets.UTF_8);
    }
}
