package lwq;

import lwq.visitor.impl.Directory;
import lwq.visitor.impl.File;
import lwq.visitor.impl.FileFindVisitor;
import lwq.visitor.impl.ListVisitor;
import org.junit.jupiter.api.Test;

/**
 * @Projectname: designMode
 * @Filename: Visitor_Test
 * @Author: LWQ
 * @Data:2023/6/10 12:48
 * @Description:
 */

public class Visitor_Test {

    @Test
    public void test01() {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory usr = new Directory("usr");
        Directory tmp = new Directory("tmp");
        File file = new File("test1.html", 500);
        File file1 = new File("test02.html", 700);
        root.add(bin);
        root.add(usr);
        usr.add(tmp);
        bin.add(file);
        tmp.add(file1);
        root.accept(new ListVisitor());

        System.out.println("==============");
        root.accept(new FileFindVisitor(), "html");
    }
}
