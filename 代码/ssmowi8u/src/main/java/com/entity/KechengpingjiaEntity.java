package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课程评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-11 12:53:14
 */
@TableName("kechengpingjia")
public class KechengpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengpingjiaEntity() {
		
	}
	
	public KechengpingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 课程类型
	 */
					
	private String kechengleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 教学准备
	 */
					
	private Integer jiaoxuezhunbei;
	
	/**
	 * 教学设计
	 */
					
	private Integer jiaoxuesheji;
	
	/**
	 * 教学方法
	 */
					
	private Integer jiaoxuefangfa;
	
	/**
	 * 教学效果
	 */
					
	private Integer jiaoxuexiaoguo;
	
	/**
	 * 总评分
	 */
					
	private String zongpingfen;
	
	/**
	 * 整体评价
	 */
					
	private String zhengtipingjia;
	
	/**
	 * 评价日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingjiariqi;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：课程类型
	 */
	public void setKechengleixing(String kechengleixing) {
		this.kechengleixing = kechengleixing;
	}
	/**
	 * 获取：课程类型
	 */
	public String getKechengleixing() {
		return kechengleixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：教学准备
	 */
	public void setJiaoxuezhunbei(Integer jiaoxuezhunbei) {
		this.jiaoxuezhunbei = jiaoxuezhunbei;
	}
	/**
	 * 获取：教学准备
	 */
	public Integer getJiaoxuezhunbei() {
		return jiaoxuezhunbei;
	}
	/**
	 * 设置：教学设计
	 */
	public void setJiaoxuesheji(Integer jiaoxuesheji) {
		this.jiaoxuesheji = jiaoxuesheji;
	}
	/**
	 * 获取：教学设计
	 */
	public Integer getJiaoxuesheji() {
		return jiaoxuesheji;
	}
	/**
	 * 设置：教学方法
	 */
	public void setJiaoxuefangfa(Integer jiaoxuefangfa) {
		this.jiaoxuefangfa = jiaoxuefangfa;
	}
	/**
	 * 获取：教学方法
	 */
	public Integer getJiaoxuefangfa() {
		return jiaoxuefangfa;
	}
	/**
	 * 设置：教学效果
	 */
	public void setJiaoxuexiaoguo(Integer jiaoxuexiaoguo) {
		this.jiaoxuexiaoguo = jiaoxuexiaoguo;
	}
	/**
	 * 获取：教学效果
	 */
	public Integer getJiaoxuexiaoguo() {
		return jiaoxuexiaoguo;
	}
	/**
	 * 设置：总评分
	 */
	public void setZongpingfen(String zongpingfen) {
		this.zongpingfen = zongpingfen;
	}
	/**
	 * 获取：总评分
	 */
	public String getZongpingfen() {
		return zongpingfen;
	}
	/**
	 * 设置：整体评价
	 */
	public void setZhengtipingjia(String zhengtipingjia) {
		this.zhengtipingjia = zhengtipingjia;
	}
	/**
	 * 获取：整体评价
	 */
	public String getZhengtipingjia() {
		return zhengtipingjia;
	}
	/**
	 * 设置：评价日期
	 */
	public void setPingjiariqi(Date pingjiariqi) {
		this.pingjiariqi = pingjiariqi;
	}
	/**
	 * 获取：评价日期
	 */
	public Date getPingjiariqi() {
		return pingjiariqi;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
