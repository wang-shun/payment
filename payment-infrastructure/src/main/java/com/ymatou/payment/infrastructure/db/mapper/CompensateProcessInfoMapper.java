package com.ymatou.payment.infrastructure.db.mapper;

import com.ymatou.payment.infrastructure.db.model.CompensateProcessInfoExample;
import com.ymatou.payment.infrastructure.db.model.CompensateProcessInfoPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompensateProcessInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int countByExample(CompensateProcessInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int deleteByExample(CompensateProcessInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int deleteByPrimaryKey(Long compensateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int insert(CompensateProcessInfoPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int insertSelective(CompensateProcessInfoPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    List<CompensateProcessInfoPo> selectByExampleWithBLOBs(CompensateProcessInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    List<CompensateProcessInfoPo> selectByExample(CompensateProcessInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    CompensateProcessInfoPo selectByPrimaryKey(Long compensateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByExampleSelective(@Param("record") CompensateProcessInfoPo record, @Param("example") CompensateProcessInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") CompensateProcessInfoPo record, @Param("example") CompensateProcessInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByExample(@Param("record") CompensateProcessInfoPo record, @Param("example") CompensateProcessInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByPrimaryKeySelective(CompensateProcessInfoPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(CompensateProcessInfoPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PP_CompensateProcessInfo
     *
     * @mbggenerated Mon Jun 13 13:47:39 CST 2016
     */
    int updateByPrimaryKey(CompensateProcessInfoPo record);
}