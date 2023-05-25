package org.hibernate.tool.orm.jbt.wrp;

import org.hibernate.tool.api.export.ExporterConstants;
import org.hibernate.tool.internal.export.common.GenericExporter;

public class GenericExporterWrapper extends GenericExporter {

	public void setFilePattern(String filePattern) {
		getProperties().setProperty(ExporterConstants.FILE_PATTERN, filePattern);
	}

}
