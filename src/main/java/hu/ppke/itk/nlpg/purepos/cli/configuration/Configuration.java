/*******************************************************************************
 * Copyright (c) 2012 György Orosz, Attila Novák.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/
 * 
 * This file is part of PurePos.
 * 
 * PurePos is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * PurePos is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser Public License for more details.
 * 
 * Contributors:
 *     György Orosz - initial API and implementation
 ******************************************************************************/
package hu.ppke.itk.nlpg.purepos.cli.configuration;

import hu.ppke.itk.nlpg.purepos.model.internal.StringMapping;

import java.util.List;

public class Configuration {
	public Configuration(List<StringMapping> tagMappings, List<StringMapping> lemmaMappings) {
		this.tagMappings = tagMappings;
		this.lemmaMappings = lemmaMappings;
	}

	protected List<StringMapping> tagMappings;
	protected List<StringMapping> lemmaMappings;

	public List<StringMapping> getTagMappings() {
		return tagMappings;
	}

	public List<StringMapping> getLemmaMappings() {
		return lemmaMappings;
	}
}
