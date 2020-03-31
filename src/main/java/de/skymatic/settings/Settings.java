package de.skymatic.settings;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Settings {

	private static final String DEFAULT_TEMPLATE_PATH = ""; //TODO
	private static final String DEFAULT_OUTPUT_PATH = ""; //TODO
	private static final String DEFAULT_INVOICE_NUMBER_PREFIX = ""; //TODO
	private static final int DEFAULT_LAST_USED_INVOICE_NUMBER = 0;
	private static final boolean DEFAULT_SAVE_AND_OVERWRITE_SETTINGS = false;


	private final StringProperty templatePath = new SimpleStringProperty(DEFAULT_TEMPLATE_PATH);
	private final StringProperty outputPath = new SimpleStringProperty(DEFAULT_OUTPUT_PATH);
	private final StringProperty invoiceNumberPrefix = new SimpleStringProperty(DEFAULT_INVOICE_NUMBER_PREFIX);
	private final IntegerProperty lastUsedInvoiceNumber = new SimpleIntegerProperty(DEFAULT_LAST_USED_INVOICE_NUMBER);
	private final BooleanProperty saveAndOverwriteSettings = new SimpleBooleanProperty(DEFAULT_SAVE_AND_OVERWRITE_SETTINGS);


	/*
	Getter and Setter
	 */
	public String getTemplatePath() {
		return templatePath.get();
	}

	public StringProperty templatePathProperty() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath.set(templatePath);
	}

	public String getOutputPath() {
		return outputPath.get();
	}

	public StringProperty outputPathProperty() {
		return outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath.set(outputPath);
	}

	public int getLastUsedInvoiceNumber() {
		return lastUsedInvoiceNumber.get();
	}

	public IntegerProperty lastUsedInvoiceNumberProperty() {
		return lastUsedInvoiceNumber;
	}

	public void setLastUsedInvoiceNumber(int lastUsedInvoiceNumber) {
		this.lastUsedInvoiceNumber.set(lastUsedInvoiceNumber);
	}

	public String getInvoiceNumberPrefix() {
		return invoiceNumberPrefix.get();
	}

	public StringProperty invoiceNumberPrefixProperty() {
		return invoiceNumberPrefix;
	}

	public void setInvoiceNumberPrefix(String invoiceNumberPrefix) {
		this.invoiceNumberPrefix.set(invoiceNumberPrefix);
	}

	public boolean isSaveAndOverwriteSettings() {
		return saveAndOverwriteSettings.get();
	}

	public BooleanProperty saveAndOverwriteSettingsProperty() {
		return saveAndOverwriteSettings;
	}

	public void setSaveAndOverwriteSettings(boolean saveAndOverwriteSettings) {
		this.saveAndOverwriteSettings.set(saveAndOverwriteSettings);
	}
}