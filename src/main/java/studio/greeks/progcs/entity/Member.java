package studio.greeks.progcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 会员表
 *
 * @author <a href="mailto:wuzhao-1@thunisoft.com>吴昭</a>
 */
@Entity
@Table(name = "t_member",
        indexes = {
                @Index(name = "i_member_vip_no", columnList = "vip_no", unique = true),
                @Index(name = "i_member_mobile", columnList = "mobile", unique = true),
                @Index(name = "i_member_open_id", columnList = "open_id"),
                @Index(name = "i_member_real_name", columnList = "real_name"),
                @Index(name = "i_member_id_card_no", columnList = "id_card_no"),
                @Index(name = "i_member_country", columnList = "country"),
                @Index(name = "i_member_province", columnList = "province"),
                @Index(name = "i_member_city", columnList = "city"),
                @Index(name = "i_member_invite_code", columnList = "invite_code")
        })
public class Member extends BaseEntity {
    /**
     * 微信公众号openId
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 会员编号（目前定义为7位数值，从1000000开始）
     */
    @Column(name = "vip_no", nullable = false, unique = true)
    private String vipNo;

    /**
     * 手机号
     */
    @Column(name = "mobile", nullable = false, unique = true)
    private String mobile;

    /**
     * 会员登录账号
     */
    private String password;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号码
     */
    @Column(name = "id_card_no")
    private String idCardNo;

    /**
     * 所属国籍
     */
    @Column(name = "country")
    private String country;

    /**
     * 所属省份
     */
    @Column(name = "province")
    private String province;

    /**
     * 所诉城市
     */
    @Column(name = "city")
    private String city;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 邀请码
     */
    @Column(name = "invite_code")
    private String inviteCode;
}
