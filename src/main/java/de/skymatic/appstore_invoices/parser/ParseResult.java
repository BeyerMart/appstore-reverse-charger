package de.skymatic.appstore_invoices.parser;

import de.skymatic.appstore_invoices.model.SalesEntry;

import java.time.YearMonth;
import java.util.Collection;

public class ParseResult {

	private final YearMonth yearMonth;
	private final Collection<SalesEntry> sales;

	public ParseResult(YearMonth yearMonth, Collection<SalesEntry> sales) {
		this.yearMonth = yearMonth;
		this.sales = sales;
	}

	public YearMonth getYearMonth() {
		return yearMonth;
	}

	public Collection<SalesEntry> getSales() {
		return sales;
	}

}
