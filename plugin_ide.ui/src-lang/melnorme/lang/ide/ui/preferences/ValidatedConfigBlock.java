/*******************************************************************************
 * Copyright (c) 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui.preferences;


import melnorme.lang.tooling.data.MultipleFieldValidation;
import melnorme.util.swt.components.AbstractComponentExt;

public abstract class ValidatedConfigBlock extends AbstractComponentExt {
	
	public final MultipleFieldValidation validation = new MultipleFieldValidation();
	
	public ValidatedConfigBlock() {
		super();
	}
	
}