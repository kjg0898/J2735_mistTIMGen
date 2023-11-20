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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type RegionPointSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class RegionPointSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public RegionPointSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegionPointSet(Position3D anchor, Zoom scale, RegionList nodeList)
    {
	setAnchor(anchor);
	setScale(scale);
	setNodeList(nodeList);
    }
    
    /**
     * Construct with required components.
     */
    public RegionPointSet(RegionList nodeList)
    {
	setNodeList(nodeList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Position3D();
	mComponents[1] = new Zoom();
	mComponents[2] = new RegionList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Position3D();
	    case 1:
		return new Zoom();
	    case 2:
		return new RegionList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "anchor"
    public Position3D getAnchor()
    {
	return (Position3D)mComponents[0];
    }
    
    public void setAnchor(Position3D anchor)
    {
	mComponents[0] = anchor;
    }
    
    public boolean hasAnchor()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAnchor()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "scale"
    public Zoom getScale()
    {
	return (Zoom)mComponents[1];
    }
    
    public void setScale(Zoom scale)
    {
	mComponents[1] = scale;
    }
    
    public boolean hasScale()
    {
	return componentIsPresent(1);
    }
    
    public void deleteScale()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "nodeList"
    public RegionList getNodeList()
    {
	return (RegionList)mComponents[2];
    }
    
    public void setNodeList(RegionList nodeList)
    {
	mComponents[2] = nodeList;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "RegionPointSet"
	),
	new QName (
	    "DSRC",
	    "RegionPointSet"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Position3D"
			    ),
			    new QName (
				"DSRC",
				"Position3D"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0
			)
		    ),
		    "anchor",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Zoom"
			    ),
			    new QName (
				"DSRC",
				"Zoom"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Zoom(0), 
				    new Zoom(15),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(15)
			    ),
			    null
			)
		    ),
		    "scale",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RegionList"
			    ),
			    new QName (
				"DSRC",
				"RegionList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "RegionOffsets"
				)
			    )
			)
		    ),
		    "nodeList",
		    2,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RegionPointSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RegionPointSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RegionPointSet
