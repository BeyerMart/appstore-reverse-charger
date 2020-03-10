package de.skymatic.model;

import java.util.Hashtable;
import java.util.Map;

public class Invoice {

	private Subsidiary subsidiary;
	private Map<RegionPlusCurrency, Sales> salesPerCountryPlusCurrency;

	public Invoice(RegionPlusCurrency rpc, Sales s) {
		this.subsidiary = AppleUtility.mapRegionPlusCurrencyToSubsidiary(rpc);
		this.salesPerCountryPlusCurrency = new Hashtable<>();
		salesPerCountryPlusCurrency.put(rpc, s);
	}

	public Subsidiary getSubsidiary() {
		return subsidiary;
	}

	public double sum() {
		return salesPerCountryPlusCurrency.values().stream().mapToDouble(Sales::getProceeds).sum();
	}

	public void addSales(RegionPlusCurrency rpc, Sales s) {
		if (salesPerCountryPlusCurrency.containsKey(rpc)) {
			throw new IllegalArgumentException("RegionPlusCurrency already exists!");
		} else if (subsidiary != AppleUtility.mapRegionPlusCurrencyToSubsidiary(rpc)) {
			throw new IllegalArgumentException("RegionPlusCurrency does not belong to this Subsidiary");
		} else {
			salesPerCountryPlusCurrency.put(rpc, s);
		}
	}
}
