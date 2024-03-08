package horse.testing.beans.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author li.hongming
 * @date 2022/3/15
 */
public class OsCondition {

    public static class MacCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            String osName = context.getEnvironment().getProperty("os.name");
            return osName != null && osName.startsWith("Mac");
        }

    }

    public static class WindowCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            String osName = context.getEnvironment().getProperty("os.name");
            return osName != null && osName.startsWith("Windows");

//
//            MultiValueMap<String, Object> attrs =
//                    metadata.getAllAnnotationAttributes(annotation);
//            if (attrs != null) {
//                for (Object value : attrs.get("value")) {
//                    String[] properties = (String[]) value;
//                    for (String property : properties) {
//                        if (Strings.isNotBlank(property)) {
//                            boolean enabled = context.getEnvironment().getProperty(property, Boolean.class, false);
//                            match = match && enabled;
//                        }
//                    }
//                }
//            }
        }

    }

    public static class LinuxCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            String osName = context.getEnvironment().getProperty("os.name");
            return (osName != null && osName.startsWith("Linux"));
        }

    }


}
