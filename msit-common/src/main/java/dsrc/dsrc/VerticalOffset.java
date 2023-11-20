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
import com.oss.asn1.OpenType;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type VerticalOffset from ASN1 Module DSRC.
 * @see Choice
 */

public class VerticalOffset extends Choice {
    
    /**
     * The default constructor.
     */
    public VerticalOffset()
    {
    }
    
    public static final  int  offset1_chosen = 1;
    public static final  int  offset2_chosen = 2;
    public static final  int  offset3_chosen = 3;
    public static final  int  offset4_chosen = 4;
    public static final  int  offset5_chosen = 5;
    public static final  int  offset6_chosen = 6;
    public static final  int  elevation_chosen = 7;
    public static final  int  regional_chosen = 8;
    
    // Methods for field "offset1"
    public static VerticalOffset createVerticalOffsetWithOffset1(long offset1)
    {
	return createVerticalOffsetWithOffset1(new VertOffset_B07(offset1));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset1(VertOffset_B07 offset1)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset1(offset1);
	return __object;
    }
    
    public boolean hasOffset1()
    {
	return getChosenFlag() == offset1_chosen;
    }
    
    public VertOffset_B07 getOffset1()
    {
	if (hasOffset1())
	    return (VertOffset_B07)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset1(long offset1)
    {
	setOffset1(new VertOffset_B07(offset1));
    }
    
    public void setOffset1(VertOffset_B07 offset1)
    {
	setChosenValue(offset1);
	setChosenFlag(offset1_chosen);
    }
    
    
    // Methods for field "offset2"
    public static VerticalOffset createVerticalOffsetWithOffset2(long offset2)
    {
	return createVerticalOffsetWithOffset2(new VertOffset_B08(offset2));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset2(VertOffset_B08 offset2)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset2(offset2);
	return __object;
    }
    
    public boolean hasOffset2()
    {
	return getChosenFlag() == offset2_chosen;
    }
    
    public VertOffset_B08 getOffset2()
    {
	if (hasOffset2())
	    return (VertOffset_B08)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset2(long offset2)
    {
	setOffset2(new VertOffset_B08(offset2));
    }
    
    public void setOffset2(VertOffset_B08 offset2)
    {
	setChosenValue(offset2);
	setChosenFlag(offset2_chosen);
    }
    
    
    // Methods for field "offset3"
    public static VerticalOffset createVerticalOffsetWithOffset3(long offset3)
    {
	return createVerticalOffsetWithOffset3(new VertOffset_B09(offset3));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset3(VertOffset_B09 offset3)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset3(offset3);
	return __object;
    }
    
    public boolean hasOffset3()
    {
	return getChosenFlag() == offset3_chosen;
    }
    
    public VertOffset_B09 getOffset3()
    {
	if (hasOffset3())
	    return (VertOffset_B09)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset3(long offset3)
    {
	setOffset3(new VertOffset_B09(offset3));
    }
    
    public void setOffset3(VertOffset_B09 offset3)
    {
	setChosenValue(offset3);
	setChosenFlag(offset3_chosen);
    }
    
    
    // Methods for field "offset4"
    public static VerticalOffset createVerticalOffsetWithOffset4(long offset4)
    {
	return createVerticalOffsetWithOffset4(new VertOffset_B10(offset4));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset4(VertOffset_B10 offset4)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset4(offset4);
	return __object;
    }
    
    public boolean hasOffset4()
    {
	return getChosenFlag() == offset4_chosen;
    }
    
    public VertOffset_B10 getOffset4()
    {
	if (hasOffset4())
	    return (VertOffset_B10)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset4(long offset4)
    {
	setOffset4(new VertOffset_B10(offset4));
    }
    
    public void setOffset4(VertOffset_B10 offset4)
    {
	setChosenValue(offset4);
	setChosenFlag(offset4_chosen);
    }
    
    
    // Methods for field "offset5"
    public static VerticalOffset createVerticalOffsetWithOffset5(long offset5)
    {
	return createVerticalOffsetWithOffset5(new VertOffset_B11(offset5));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset5(VertOffset_B11 offset5)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset5(offset5);
	return __object;
    }
    
    public boolean hasOffset5()
    {
	return getChosenFlag() == offset5_chosen;
    }
    
    public VertOffset_B11 getOffset5()
    {
	if (hasOffset5())
	    return (VertOffset_B11)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset5(long offset5)
    {
	setOffset5(new VertOffset_B11(offset5));
    }
    
    public void setOffset5(VertOffset_B11 offset5)
    {
	setChosenValue(offset5);
	setChosenFlag(offset5_chosen);
    }
    
    
    // Methods for field "offset6"
    public static VerticalOffset createVerticalOffsetWithOffset6(long offset6)
    {
	return createVerticalOffsetWithOffset6(new VertOffset_B12(offset6));
    }
    
    public static VerticalOffset createVerticalOffsetWithOffset6(VertOffset_B12 offset6)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setOffset6(offset6);
	return __object;
    }
    
    public boolean hasOffset6()
    {
	return getChosenFlag() == offset6_chosen;
    }
    
    public VertOffset_B12 getOffset6()
    {
	if (hasOffset6())
	    return (VertOffset_B12)mChosenValue;
	else
	    return null;
    }
    
    public void setOffset6(long offset6)
    {
	setOffset6(new VertOffset_B12(offset6));
    }
    
    public void setOffset6(VertOffset_B12 offset6)
    {
	setChosenValue(offset6);
	setChosenFlag(offset6_chosen);
    }
    
    
    // Methods for field "elevation"
    public static VerticalOffset createVerticalOffsetWithElevation(long elevation)
    {
	return createVerticalOffsetWithElevation(new Elevation(elevation));
    }
    
    public static VerticalOffset createVerticalOffsetWithElevation(Elevation elevation)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setElevation(elevation);
	return __object;
    }
    
    public boolean hasElevation()
    {
	return getChosenFlag() == elevation_chosen;
    }
    
    public Elevation getElevation()
    {
	if (hasElevation())
	    return (Elevation)mChosenValue;
	else
	    return null;
    }
    
    public void setElevation(long elevation)
    {
	setElevation(new Elevation(elevation));
    }
    
    public void setElevation(Elevation elevation)
    {
	setChosenValue(elevation);
	setChosenFlag(elevation_chosen);
    }
    
    
    // Methods for field "regional"
    public static VerticalOffset createVerticalOffsetWithRegional(Regional regional)
    {
	VerticalOffset __object = new VerticalOffset();

	__object.setRegional(regional);
	return __object;
    }
    
    public boolean hasRegional()
    {
	return getChosenFlag() == regional_chosen;
    }
    
    public Regional getRegional()
    {
	if (hasRegional())
	    return (Regional)mChosenValue;
	else
	    return null;
    }
    
    public void setRegional(Regional regional)
    {
	setChosenValue(regional);
	setChosenFlag(regional_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Regional from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Regional extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Regional(RegionId regionId, OpenType regExtValue)
	{
	    setRegionId(regionId);
	    setRegExtValue(regExtValue);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RegionId();
	    mComponents[1] = new OpenType();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[2];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new RegionId();
		case 1:
		    return new OpenType();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "regionId"
	public RegionId getRegionId()
	{
	    return (RegionId)mComponents[0];
	}
	
	public void setRegionId(RegionId regionId)
	{
	    mComponents[0] = regionId;
	}
	
	
	// Methods for field "regExtValue"
	public OpenType getRegExtValue()
	{
	    return (OpenType)mComponents[1];
	}
	
	public void setRegExtValue(OpenType regExtValue)
	{
	    mComponents[1] = regExtValue;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"VerticalOffset$Regional"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    274962,
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
				    "RegionId"
				),
				new QName (
				    "DSRC",
				    "RegionId"
				),
				274450,
				new Intersection (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new RegionId(0), 
					    new RegionId(255),
					    0
					)
				    ),
				    new TableConstraint (
					dsrc.region.REGION.reg_VerticalOffset,
					0
				    )
				),
				new Bounds (
				    Long.valueOf(0),
				    Long.valueOf(255)
				),
				null
			    )
			),
			"regionId",
			0,
			274,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new OpenTypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "OpenType"
				),
				new QName (
				    "builtin",
				    "OpenType"
				),
				1323026,
				new ComponentRelationConstraint (
				    new TableConstraint (
					dsrc.region.REGION.reg_VerticalOffset,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"VerticalOffset$Regional"
						    ),
						    0
						),
						0
					    )
					}
				    )
				),
				new ComponentRelationConstraint (
				    new TableConstraint (
					dsrc.region.REGION.reg_VerticalOffset,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"VerticalOffset$Regional"
						    ),
						    0
						),
						0
					    )
					}
				    )
				)
			    )
			),
			"regExtValue",
			1,
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
			    new TagDecoderElement((short)0x8000, 0)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Regional

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case offset1_chosen:
		return new VertOffset_B07();
	    case offset2_chosen:
		return new VertOffset_B08();
	    case offset3_chosen:
		return new VertOffset_B09();
	    case offset4_chosen:
		return new VertOffset_B10();
	    case offset5_chosen:
		return new VertOffset_B11();
	    case offset6_chosen:
		return new VertOffset_B12();
	    case elevation_chosen:
		return new Elevation();
	    case regional_chosen:
		return new Regional();
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
	    "VerticalOffset"
	),
	new QName (
	    "DSRC",
	    "VerticalOffset"
	),
	274450,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VertOffset_B07"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B07"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B07(-64), 
				    new VertOffset_B07(63),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-64),
				Long.valueOf(63)
			    ),
			    null
			)
		    ),
		    "offset1",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VertOffset_B08"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B08"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B08(-128), 
				    new VertOffset_B08(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-128),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "offset2",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VertOffset_B09"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B09"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B09(-256), 
				    new VertOffset_B09(255),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-256),
				Long.valueOf(255)
			    ),
			    null
			)
		    ),
		    "offset3",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VertOffset_B10"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B10"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B10(-512), 
				    new VertOffset_B10(511),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-512),
				Long.valueOf(511)
			    ),
			    null
			)
		    ),
		    "offset4",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VertOffset_B11"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B11"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B11(-1024), 
				    new VertOffset_B11(1023),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-1024),
				Long.valueOf(1023)
			    ),
			    null
			)
		    ),
		    "offset5",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VertOffset_B12"
			    ),
			    new QName (
				"DSRC",
				"VertOffset-B12"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VertOffset_B12(-2048), 
				    new VertOffset_B12(2047),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-2048),
				Long.valueOf(2047)
			    ),
			    null
			)
		    ),
		    "offset6",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Elevation"
			    ),
			    new QName (
				"DSRC",
				"Elevation"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Elevation(-4096), 
				    new Elevation(61439),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-4096),
				Long.valueOf(61439)
			    ),
			    null
			)
		    ),
		    "elevation",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "VerticalOffset$Regional"
			)
		    ),
		    "regional",
		    7,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VerticalOffset object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VerticalOffset object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for VerticalOffset
