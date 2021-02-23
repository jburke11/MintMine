package org.intermine.bio.dataconversion;

/*
 * Copyright (C) 2002-2019 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.LinkedHashMap;
 import java.util.List;
 import java.util.Map;

 import org.apache.commons.lang.StringUtils;
 import org.apache.log4j.Logger;
 import org.intermine.bio.dataconversion.IdResolver;
 import org.intermine.bio.dataconversion.IdResolverService;
 import org.intermine.bio.io.gff3.GFF3Record;
 import org.intermine.metadata.Model;
 import org.intermine.xml.full.Attribute;
 import org.intermine.xml.full.Item;

/**
 * A converter/retriever for the OfficinalisGff dataset via GFF files.
 */

public class OfficinalisGffGFF3RecordHandler extends GFF3RecordHandler
{

    /**
     * Create a new OfficinalisGffGFF3RecordHandler for the given data model.
     * @param model the model for which items will be created
     */
    public OfficinalisGffGFF3RecordHandler (Model model) {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void process(GFF3Record record) {
        // This method is called for every line of GFF3 file(s) being read.  Features and their
        // locations are already created but not stored so you can make changes here.  Attributes
        // are from the last column of the file are available in a map with the attribute name as
        // the key.   For example:
        //
                 Item feature = getFeature();
                 String identifier = record.getId();
                 feature.setAttribute("primaryIdentifier", ("off"+identifier));
        //         String name = record.getId();
        //         record.setAttribute("primaryIdentifier", name);
        //       String symbol = record.getAttributes().get("symbol");
        //       feature.setAttribute("symbol", symbol);
        //
        // Any new Items created can be stored by calling addItem().  For example:
        //
        //       String geneIdentifier = record.getAttributes().get("gene").get(0);
        //       record.setAttribute("primaryIdentifier", geneIdentifier);
        //
        // You should make sure that new Items you create are unique, i.e. by storing in a map by
        // some identifier.

    }

}
