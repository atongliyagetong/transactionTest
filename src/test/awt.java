import java.awt.*;

/**
 * Created by Chen on 2018/6/20.
 */
public class awt {
    public static void main(String[] args) {
        new FrameOut();
    }
}

    class FrameOut extends Frame{
        Button btn;
        FrameOut(){
            super("��ť");
            btn = new Button("������");
            setLayout(new FlowLayout());
            add(btn);
            setSize(300, 200);
            show();
        }
    }

