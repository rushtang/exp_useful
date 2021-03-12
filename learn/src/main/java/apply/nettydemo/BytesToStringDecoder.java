package apply.nettydemo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author tangmaoheng
 * @createTime 2019年12月18日 09:43:00
 */
@ChannelHandler.Sharable
public class BytesToStringDecoder extends MessageToMessageDecoder<ByteBuf> {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        //解码
        String str = msg.toString(StandardCharsets.UTF_8);

        out.add(str);
    }
}
