package studio.greeks.progcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 系统用户表
 * @author <a href="mailto:wuzhao-1@thunisoft.com>吴昭</a>
 */
@Entity
@Table(name = "t_sys_user",
        indexes = {
        @Index(name = "i_sys_user_username", columnList = "user_name", unique = true)
})
public class SysUser extends BaseEntity {

    @Column(name = "user_name", nullable = false, unique = true)
    private String username;

    private String password;
}
