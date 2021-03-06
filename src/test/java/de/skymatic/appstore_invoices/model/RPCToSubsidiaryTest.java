package de.skymatic.appstore_invoices.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RPCToSubsidiaryTest {

	@Test
	public void testEachExistingRPCIsMappedToASubsidiary() {
		for (var rpc : RegionPlusCurrency.values()) {
			Assertions.assertDoesNotThrow(() -> AppleUtility.mapRegionPlusCurrencyToSubsidiary(rpc));
		}
	}

}
