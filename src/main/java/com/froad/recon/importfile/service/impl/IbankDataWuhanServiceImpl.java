package com.froad.recon.importfile.service.impl;

import java.util.List;
import java.util.Map;

import com.froad.comon.dao.impl.DBException;
import com.froad.comon.exception.ServiceException;
import com.froad.comon.util.Logger;
import com.froad.recon.importfile.dao.IbankDataWuhanDAO;
import com.froad.recon.importfile.dao.impl.IbankDataWuhanDAOImpl;
import com.froad.recon.importfile.model.IbankDataWuhan;
import com.froad.recon.importfile.service.IbankDataWuhanService;


/**
 * 武汉银行对账数据表Service实现类
 *
 * @author zhangjwei
 * @created 2015-06-16 11:07:15
 * @version 1.0
 */

public class IbankDataWuhanServiceImpl implements IbankDataWuhanService{
	private final static Logger logger = Logger.getLogger(IbankDataWuhanDAOImpl.class);
	private IbankDataWuhanDAO ibankDataWuhanDAO;
	public IbankDataWuhanDAO getibankDataWuhanDAO() {
		return ibankDataWuhanDAO;
	}
	public void setibankDataWuhanDAO(IbankDataWuhanDAO ibankDataWuhanDAO) {
		this.ibankDataWuhanDAO = ibankDataWuhanDAO;
	}
	
	/**
	 * @Title: inser 
	 * @Description: 插入单条数据
	 * @param ibankDataWuhan  ibankDataWuhan 对象
	 * @return IbankDataWuhan   返回插入完成的 ibankDataWuhan对象
	 */
	public IbankDataWuhan insert(IbankDataWuhan ibankDataWuhan) throws ServiceException{
		try {
			return ibankDataWuhanDAO.insert(ibankDataWuhan);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		}catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Title: batchInser 
	 * @Description: 插入多条数据 
	 * @param listIbankDataWuhan 插入数据的list    
	 * @throws
	 */
	public void batchInser(List<IbankDataWuhan> lists) throws ServiceException{
		try {
			ibankDataWuhanDAO.batchInser(lists);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		}catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Title: delete
	 * @Description: 根据对象删除
	 * @param objId void    
	 */
	
	public void delete(IbankDataWuhan ibankDataWuhan) throws ServiceException {
		try {
			ibankDataWuhanDAO.delete(ibankDataWuhan);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		}catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	/**
	 * @Title: batchDelete 
	 * @Description: 根据 根据对象集合删除数据
	 * @param lists id集合   
	 */
	public void batchDelete(List<IbankDataWuhan> lists) throws ServiceException {
		try {
			ibankDataWuhanDAO.batchDelete(lists);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		}catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Title: update 
	 * @Description: 跟新一条数据 ibankDataWuhan
	 * @param ibankDataWuhan  ibankDataWuhan对象
	 * @throws
	 */
	public void update(IbankDataWuhan ibankDataWuhan) throws ServiceException{
		try {
			ibankDataWuhanDAO.update(ibankDataWuhan);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		}catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Title: batchUpdate
	 * @Description: 跟新多条数据 ibankDataWuhan集合
	 * @param listIbankDataWuhan  ibankDataWuhan集合  
	 * @throws
	 */
	
	public void batchUpdate(List<IbankDataWuhan> lists) throws ServiceException {
		try {
			ibankDataWuhanDAO.batchUpdate(lists);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	/**
	 * @Title: getById
	 * @Description: 根据编号查询一条数据
	 * @param objID 编号
	 * @return IbankDataWuhan    ibankDataWuhan 对象
	 * @throws
	 */
	public IbankDataWuhan getById(String objID) throws ServiceException {
		try {
			return ibankDataWuhanDAO.getById(objID);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Title: getAll
	 * @Description: 查询所有的ibankDataWuhan数据
	 * @return List    返回一个ibankDataWuhan的集合
	 * @throws
	 */
	public List getAll() throws ServiceException {
		try {
			return ibankDataWuhanDAO.getAll();
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Title: getList
	 * @Description: 根据 ibankDataWuhan对象 查询符合的数据
	 * @param ibankDataWuhan ibankDataWuhan对象
	 * @return List    返回一个结合。 
	 * @throws
	 */
	public List getList(IbankDataWuhan ibankDataWuhan) throws ServiceException{
		try {
			return ibankDataWuhanDAO.getList(ibankDataWuhan);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Description: 根据 以paramsMap中key为字段名value为值， 查询符合条件的记录
	 * @param paramsMap 
	 * @param pageNum  页号
	 * @param pageSize 页大小
	 * @throws ServiceException
	 */
	public List<IbankDataWuhan> selectForPagin(Map<String, Object> paramsMap, Integer pageNum, Integer pageSize) 
			throws ServiceException{
		try {
			return ibankDataWuhanDAO.selectForPagin(paramsMap, pageNum, pageSize);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
	
	/**
	 * @Description: 根据 以paramsMap中key为字段名value为值， 总条数
	 * @param paramsMap 
	 * @param pageNum  页号
	 * @param pageSize 页大小
	 * @throws ServiceException
	 */
	public Integer selectForPaginCount(Map<String, Object> paramsMap) throws ServiceException{
		try {
			return ibankDataWuhanDAO.selectForPaginCount(paramsMap);
		} catch (DBException e) {
			logger.error(e);
			throw new ServiceException(e.getErrorCode(),e.getErrorMsg(),e);
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(null,e.getMessage(),e);
		}
	}
}
