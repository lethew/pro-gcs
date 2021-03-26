package studio.greeks.progcs.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 支付订单信息
 *
 * @author <a href="mailto:wuzhao-1@thunisoft.com>吴昭</a>
 */
@Entity
@Table(name = "t_pay_order",
        indexes = {
            @Index(name = "i_pay_order_member_id", columnList = "member_id")
        }
)
public class PayOrder extends BaseEntity {
    /**
     * 订单名称
     */
    private String name;

    /**
     * 订单类型
     */
    private Integer type;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 支付状态
     */
    private Integer status;

    /**
     * 支付订单编号
     */
    private String payOrderNo;

    /**
     * 所属
     */
    @Column(name = "member_id", nullable = false)
    private String memberId;
}
