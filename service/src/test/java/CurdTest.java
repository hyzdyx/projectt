import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cdrail.service.ServiceRun;
import com.cdrail.service.entity.EduTeacher;
import com.cdrail.service.service.EduTeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceRun.class)
public class CurdTest {
    @Autowired
    private EduTeacherService eduTeacherService;
    @Test
    public void run(){
        Page<EduTeacher> page = new Page<>(1,3);
        IPage<EduTeacher> page1 = eduTeacherService.page(page, null);
        eduTeacherService.removeById("1189389726308478977");
    }
}
