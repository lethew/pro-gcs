package studio.greeks.progcs.model.entity;

/**
 * 附件信息，主要用于记录文件上传信息的
 *
 * @author <a href="mailto:wuzhao-1@thunisoft.com>吴昭</a>
 */

public class Attachment extends BaseEntity {
    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件类型：视频、图片、文档
     */
    private String fileType;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 签名，用于下载后验证或者快速上传设计
     */
    private String sign;
}
