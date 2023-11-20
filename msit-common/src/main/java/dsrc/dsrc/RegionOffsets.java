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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type RegionOffsets from ASN1 Module DSRC.
 * @see Sequence
 */

public class RegionOffsets extends Sequence {
    
    /**
     * The default constructor.
     */
    public RegionOffsets()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RegionOffsets(OffsetLL_B16 xOffset, OffsetLL_B16 yOffset, 
		    OffsetLL_B16 zOffset)
    {
	setXOffset(xOffset);
	setYOffset(yOffset);
	setZOffset(zOffset);
    }
    
    /**
     * Construct with required components.
     */
    public RegionOffsets(OffsetLL_B16 xOffset, OffsetLL_B16 yOffset)
    {
	setXOffset(xOffset);
	setYOffset(yOffset);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OffsetLL_B16();
	mComponents[1] = new OffsetLL_B16();
	mComponents[2] = new OffsetLL_B16();
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
		return new OffsetLL_B16();
	    case 1:
		return new OffsetLL_B16();
	    case 2:
		return new OffsetLL_B16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "xOffset"
    public OffsetLL_B16 getXOffset()
    {
	return (OffsetLL_B16)mComponents[0];
    }
    
    public void setXOffset(OffsetLL_B16 xOffset)
    {
	mComponents[0] = xOffset;
    }
    
    
    // Methods for field "yOffset"
    public OffsetLL_B16 getYOffset()
    {
	return (OffsetLL_B16)mComponents[1];
    }
    
    public void setYOffset(OffsetLL_B16 yOffset)
    {
	mComponents[1] = yOffset;
    }
    
    
    // Methods for field "zOffset"
    public OffsetLL_B16 getZOffset()
    {
	return (OffsetLL_B16)mComponents[2];
    }
    
    public void setZOffset(OffsetLL_B16 zOffset)
    {
	mComponents[2] = zOffset;
    }
    
    public boolean hasZOffset()
    {
	return componentIsPresent(2);
    }
    
    public void deleteZOffset()
    {
	setComponentAbsent(2);
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
	    "RegionOffsets"
	),
	new QName (
	    "DSRC",
	    "RegionOffsets"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"OffsetLL_B16"
			    ),
			    new QName (
				"DSRC",
				"OffsetLL-B16"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new OffsetLL_B16(-32768), 
				    new OffsetLL_B16(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32768),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "xOffset",
		    0,
		    2,
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
				"OffsetLL_B16"
			    ),
			    new QName (
				"DSRC",
				"OffsetLL-B16"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new OffsetLL_B16(-32768), 
				    new OffsetLL_B16(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32768),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "yOffset",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"OffsetLL_B16"
			    ),
			    new QName (
				"DSRC",
				"OffsetLL-B16"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new OffsetLL_B16(-32768), 
				    new OffsetLL_B16(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32768),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "zOffset",
		    2,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' RegionOffsets object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RegionOffsets object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RegionOffsets
