/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui;

import org.eclipse.cdt.internal.ui.text.util.CColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

import com.github.rustdt.ide.ui.editor.RustSimpleSourceViewerConfiguration;
import com.github.rustdt.ide.ui.text.RustPartitionScanner;


public class TextSettings_Actual {
	
	public static final String PARTITIONING_ID = "com.github.rustdt.Partitioning";
	
	public static final String[] PARTITION_TYPES = LangPartitionTypes.PARTITION_TYPES;
	
	public static enum LangPartitionTypes {
		CODE, COMMENT, DOC_COMMENT, STRING, CHARACTER, ATTRIBUTE;
		
		public String getId() {
			if(ordinal() == 0) {
				return IDocument.DEFAULT_CONTENT_TYPE;
			}
			return toString();
		}
		
		public static final String[] PARTITION_TYPES = { 
			CODE.getId(), COMMENT.getId(), DOC_COMMENT.getId(), STRING.getId(), CHARACTER.getId(), ATTRIBUTE.getId() 
		};
		
	}
	
	public static IPartitionTokenScanner createPartitionScanner() {
		return new RustPartitionScanner();
	}
	
	public static RustSimpleSourceViewerConfiguration createSimpleSourceViewerConfiguration(
			IPreferenceStore preferenceStore, CColorManager colorManager) {
		return new RustSimpleSourceViewerConfiguration(preferenceStore, colorManager);
	}
	
}