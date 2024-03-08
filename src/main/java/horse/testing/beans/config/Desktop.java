package horse.testing.beans.config;

/**
 * @author li.hongming
 * @date 2022/3/15
 */
public interface Desktop {

    String output(String input);

    class MacDesktop implements Desktop {

        @Override
        public String output(String input) {
            String target = "苹果电脑输出:" + input;
            System.out.println(target);
            return target;
        }
    }

    class WindowDesktop implements Desktop {

        @Override
        public String output(String input) {
            String target = "Window电脑输出" + input;
            System.out.println(target);
            return target;
        }
    }
}
