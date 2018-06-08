package Dzien4_filtry;


public class FilterInfoService {

	
	private FilterInfoDao filterDao;
	
	public FilterInfoService() {
		filterDao = new FilterInfoDao();
	}
	
	
	public void insertFilterInfo(FilterInfo filter) {
		filterDao.insertFilter(filter);
	}
	
	
}