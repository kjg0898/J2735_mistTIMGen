/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.dsrc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type NodeListLL from ASN1 Module DSRC.
 * @see Choice
 */

public class NodeListLL extends Choice {
    
    /**
     * The default constructor.
     */
    public NodeListLL()
    {
    }
    
    public static final  int  nodes_chosen = 1;
    
    // Methods for field "nodes"
    public static NodeListLL createNodeListLLWithNodes(NodeSetLL nodes)
    {
	NodeListLL __object = new NodeListLL();

	__object.setNodes(nodes);
	return __object;
    }
    
    public boolean hasNodes()
    {
	return getChosenFlag() == nodes_chosen;
    }
    
    public NodeSetLL getNodes()
    {
	if (hasNodes())
	    return (NodeSetLL)mChosenValue;
	else
	    return null;
    }
    
    public void setNodes(NodeSetLL nodes)
    {
	setChosenValue(nodes);
	setChosenFlag(nodes_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case nodes_chosen:
		return new NodeSetLL();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.dsrc",
	    "NodeListLL"
	),
	new QName (
	    "DSRC",
	    "NodeListLL"
	),
	274454,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"NodeSetLL"
			    ),
			    new QName (
				"DSRC",
				"NodeSetLL"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(2),
					new INTEGER(63),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(2),
				Long.valueOf(63)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "NodeLL"
				)
			    )
			)
		    ),
		    "nodes",
		    0,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NodeListLL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NodeListLL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Check the current selection on unknown extension
     */
    public final boolean hasUnknownExtension()
    {
	return getChosenFlag() > 1;
    }
    
} // End class definition for NodeListLL
