package KappaCRM.Utility;

import KappaCRM.Infrastructure.CInfraBasicConnectionPool;

public class CUtilityStorage {

	private static CInfraBasicConnectionPool BasicConnectionPool;

	public static CInfraBasicConnectionPool getBasicConnectionPool() {
		return BasicConnectionPool;
	}

	public static void setBasicConnectionPool(CInfraBasicConnectionPool basicConnectionPool) {
		// TODO Auto-generated method stub
		BasicConnectionPool = basicConnectionPool;
	}

}
