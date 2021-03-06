package de.skymatic.appstore_invoices.model;

public class AppleUtility {

	public static Subsidiary mapRegionPlusCurrencyToSubsidiary(RegionPlusCurrency rpc) {
		switch (rpc) {
			case CANADA_CAD:
				return Subsidiary.CANADA;
			case AUSTRALIA_AUD:
			case NEW_ZEALAND_NZD:
				return Subsidiary.AUSTRALIA;
			case BRAZIL_BRL:
			case CHILE_CLP:
			case COLOMBIA_COP:
			case MEXICO_MXN:
			case AMERICAS_USD:
			case PERU_PEN:
				return Subsidiary.AMERICA;
			case JAPAN_JPY:
				return Subsidiary.JAPAN;
			case SWITZERLAND_CHF:
			case EURO_ZONE_EUR:
			case UNITED_ARAB_EMIRATES_AED:
			case BULGARIA_BGN:
			case CHINA_MAINLAND_CNY:
			case CZECH_REPUBLIC_CZK:
			case DENMARK_DKK:
			case EGYPT_EGP:
			case UNITED_KINGDOM_GBP:
			case HONG_KONG_HKD:
			case CROATIA_HRK:
			case HUNGARY_HUF:
			case INDONESIA_IDR:
			case ISRAEL_ILS:
			case INDIA_INR:
			case REPUBLIC_OF_KOREA_KRW:
			case KAZAKHASTAN_KZT:
			case MALAYSIA_MYR:
			case NIGERIA_NGN:
			case NORWAY_NOK:
			case PHILIPPINES_PHP:
			case PAKISTAN_PKR:
			case POLAND_PLN:
			case QATAR_QAR:
			case ROMANIA_RON:
			case RUSSIA_RUB:
			case SAUDI_ARABIA_SAR:
			case SWEDEN_SEK:
			case SINGAPORE_SGD:
			case THAILAND_THB:
			case TURKEY_TRY:
			case TAIWAN_TWD:
			case TANZANIA_TZS:
			case VIETNAM_VND:
			case REST_OF_WORLD_USD:
			case SOUTH_AFRICA_ZAR:
				return Subsidiary.ROW;
			default:
				throw new IllegalArgumentException("No existing mapping for RegionPlusCurrency: " + rpc.toString());
		}
	}
}
