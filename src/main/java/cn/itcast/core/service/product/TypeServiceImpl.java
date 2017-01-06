package cn.itcast.core.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.bean.product.Type;
import cn.itcast.core.bean.product.TypeQuery;
import cn.itcast.core.dao.product.TypeDao;
@Service
@Transactional
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeDao typeDao;
	@Override
	//查询类型
	public List<Type> selectTypeList(TypeQuery typeQuery) {
		return typeDao.selectByExample(typeQuery);
	}

}
