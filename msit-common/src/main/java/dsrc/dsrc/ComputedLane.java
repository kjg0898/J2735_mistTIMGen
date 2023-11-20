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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ComputedLane from ASN1 Module DSRC.
 * @see Sequence
 */

public class ComputedLane extends Sequence {
    
    /**
     * The default constructor.
     */
    public ComputedLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ComputedLane(LaneID referenceLaneId, OffsetXaxis offsetXaxis, 
		    OffsetYaxis offsetYaxis, Angle rotateXY, 
		    Scale_B12 scaleXaxis, Scale_B12 scaleYaxis, 
		    Regional regional)
    {
	setReferenceLaneId(referenceLaneId);
	setOffsetXaxis(offsetXaxis);
	setOffsetYaxis(offsetYaxis);
	setRotateXY(rotateXY);
	setScaleXaxis(scaleXaxis);
	setScaleYaxis(scaleYaxis);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public ComputedLane(LaneID referenceLaneId, OffsetXaxis offsetXaxis, 
		    OffsetYaxis offsetYaxis)
    {
	setReferenceLaneId(referenceLaneId);
	setOffsetXaxis(offsetXaxis);
	setOffsetYaxis(offsetYaxis);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LaneID();
	mComponents[1] = new OffsetXaxis();
	mComponents[2] = new OffsetYaxis();
	mComponents[3] = new Angle();
	mComponents[4] = new Scale_B12();
	mComponents[5] = new Scale_B12();
	mComponents[6] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new LaneID();
	    case 1:
		return new OffsetXaxis();
	    case 2:
		return new OffsetYaxis();
	    case 3:
		return new Angle();
	    case 4:
		return new Scale_B12();
	    case 5:
		return new Scale_B12();
	    case 6:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "referenceLaneId"
    public LaneID getReferenceLaneId()
    {
	return (LaneID)mComponents[0];
    }
    
    public void setReferenceLaneId(LaneID referenceLaneId)
    {
	mComponents[0] = referenceLaneId;
    }
    
    
    // Methods for field "offsetXaxis"
    public OffsetXaxis getOffsetXaxis()
    {
	return (OffsetXaxis)mComponents[1];
    }
    
    public void setOffsetXaxis(OffsetXaxis offsetXaxis)
    {
	mComponents[1] = offsetXaxis;
    }
    
    
    
    /**
     * Define the ASN1 Type OffsetXaxis from ASN1 Module DSRC.
     * @see Choice
     */
    public static class OffsetXaxis extends Choice {
	
	/**
	 * The default constructor.
	 */
	public OffsetXaxis()
	{
	}
	
	public static final  int  small_chosen = 1;
	public static final  int  large_chosen = 2;
	
	// Methods for field "small"
	public static OffsetXaxis createOffsetXaxisWithSmall(long small)
	{
	    return createOffsetXaxisWithSmall(new DrivenLineOffsetSm(small));
	}
	
	public static OffsetXaxis createOffsetXaxisWithSmall(DrivenLineOffsetSm small)
	{
	    OffsetXaxis __object = new OffsetXaxis();

	    __object.setSmall(small);
	    return __object;
	}
	
	public boolean hasSmall()
	{
	    return getChosenFlag() == small_chosen;
	}
	
	public DrivenLineOffsetSm getSmall()
	{
	    if (hasSmall())
		return (DrivenLineOffsetSm)mChosenValue;
	    else
		return null;
	}
	
	public void setSmall(long small)
	{
	    setSmall(new DrivenLineOffsetSm(small));
	}
	
	public void setSmall(DrivenLineOffsetSm small)
	{
	    setChosenValue(small);
	    setChosenFlag(small_chosen);
	}
	
	
	// Methods for field "large"
	public static OffsetXaxis createOffsetXaxisWithLarge(long large)
	{
	    return createOffsetXaxisWithLarge(new DrivenLineOffsetLg(large));
	}
	
	public static OffsetXaxis createOffsetXaxisWithLarge(DrivenLineOffsetLg large)
	{
	    OffsetXaxis __object = new OffsetXaxis();

	    __object.setLarge(large);
	    return __object;
	}
	
	public boolean hasLarge()
	{
	    return getChosenFlag() == large_chosen;
	}
	
	public DrivenLineOffsetLg getLarge()
	{
	    if (hasLarge())
		return (DrivenLineOffsetLg)mChosenValue;
	    else
		return null;
	}
	
	public void setLarge(long large)
	{
	    setLarge(new DrivenLineOffsetLg(large));
	}
	
	public void setLarge(DrivenLineOffsetLg large)
	{
	    setChosenValue(large);
	    setChosenFlag(large_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case small_chosen:
		    return new DrivenLineOffsetSm();
		case large_chosen:
		    return new DrivenLineOffsetLg();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ComputedLane$OffsetXaxis"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
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
				    "DrivenLineOffsetSm"
				),
				new QName (
				    "DSRC",
				    "DrivenLineOffsetSm"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DrivenLineOffsetSm(-2047), 
					new DrivenLineOffsetSm(2047),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(-2047),
				    Long.valueOf(2047)
				),
				null
			    )
			),
			"small",
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
				    "DrivenLineOffsetLg"
				),
				new QName (
				    "DSRC",
				    "DrivenLineOffsetLg"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DrivenLineOffsetLg(-32767), 
					new DrivenLineOffsetLg(32767),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(-32767),
				    Long.valueOf(32767)
				),
				null
			    )
			),
			"large",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' OffsetXaxis object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' OffsetXaxis object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for OffsetXaxis

    // Methods for field "offsetYaxis"
    public OffsetYaxis getOffsetYaxis()
    {
	return (OffsetYaxis)mComponents[2];
    }
    
    public void setOffsetYaxis(OffsetYaxis offsetYaxis)
    {
	mComponents[2] = offsetYaxis;
    }
    
    
    
    /**
     * Define the ASN1 Type OffsetYaxis from ASN1 Module DSRC.
     * @see Choice
     */
    public static class OffsetYaxis extends Choice {
	
	/**
	 * The default constructor.
	 */
	public OffsetYaxis()
	{
	}
	
	public static final  int  small_chosen = 1;
	public static final  int  large_chosen = 2;
	
	// Methods for field "small"
	public static OffsetYaxis createOffsetYaxisWithSmall(long small)
	{
	    return createOffsetYaxisWithSmall(new DrivenLineOffsetSm(small));
	}
	
	public static OffsetYaxis createOffsetYaxisWithSmall(DrivenLineOffsetSm small)
	{
	    OffsetYaxis __object = new OffsetYaxis();

	    __object.setSmall(small);
	    return __object;
	}
	
	public boolean hasSmall()
	{
	    return getChosenFlag() == small_chosen;
	}
	
	public DrivenLineOffsetSm getSmall()
	{
	    if (hasSmall())
		return (DrivenLineOffsetSm)mChosenValue;
	    else
		return null;
	}
	
	public void setSmall(long small)
	{
	    setSmall(new DrivenLineOffsetSm(small));
	}
	
	public void setSmall(DrivenLineOffsetSm small)
	{
	    setChosenValue(small);
	    setChosenFlag(small_chosen);
	}
	
	
	// Methods for field "large"
	public static OffsetYaxis createOffsetYaxisWithLarge(long large)
	{
	    return createOffsetYaxisWithLarge(new DrivenLineOffsetLg(large));
	}
	
	public static OffsetYaxis createOffsetYaxisWithLarge(DrivenLineOffsetLg large)
	{
	    OffsetYaxis __object = new OffsetYaxis();

	    __object.setLarge(large);
	    return __object;
	}
	
	public boolean hasLarge()
	{
	    return getChosenFlag() == large_chosen;
	}
	
	public DrivenLineOffsetLg getLarge()
	{
	    if (hasLarge())
		return (DrivenLineOffsetLg)mChosenValue;
	    else
		return null;
	}
	
	public void setLarge(long large)
	{
	    setLarge(new DrivenLineOffsetLg(large));
	}
	
	public void setLarge(DrivenLineOffsetLg large)
	{
	    setChosenValue(large);
	    setChosenFlag(large_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case small_chosen:
		    return new DrivenLineOffsetSm();
		case large_chosen:
		    return new DrivenLineOffsetLg();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ComputedLane$OffsetYaxis"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
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
				    "DrivenLineOffsetSm"
				),
				new QName (
				    "DSRC",
				    "DrivenLineOffsetSm"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DrivenLineOffsetSm(-2047), 
					new DrivenLineOffsetSm(2047),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(-2047),
				    Long.valueOf(2047)
				),
				null
			    )
			),
			"small",
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
				    "DrivenLineOffsetLg"
				),
				new QName (
				    "DSRC",
				    "DrivenLineOffsetLg"
				),
				274450,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DrivenLineOffsetLg(-32767), 
					new DrivenLineOffsetLg(32767),
					0
				    )
				),
				new Bounds (
				    Long.valueOf(-32767),
				    Long.valueOf(32767)
				),
				null
			    )
			),
			"large",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' OffsetYaxis object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' OffsetYaxis object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for OffsetYaxis

    // Methods for field "rotateXY"
    public Angle getRotateXY()
    {
	return (Angle)mComponents[3];
    }
    
    public void setRotateXY(Angle rotateXY)
    {
	mComponents[3] = rotateXY;
    }
    
    public boolean hasRotateXY()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRotateXY()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "scaleXaxis"
    public Scale_B12 getScaleXaxis()
    {
	return (Scale_B12)mComponents[4];
    }
    
    public void setScaleXaxis(Scale_B12 scaleXaxis)
    {
	mComponents[4] = scaleXaxis;
    }
    
    public boolean hasScaleXaxis()
    {
	return componentIsPresent(4);
    }
    
    public void deleteScaleXaxis()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "scaleYaxis"
    public Scale_B12 getScaleYaxis()
    {
	return (Scale_B12)mComponents[5];
    }
    
    public void setScaleYaxis(Scale_B12 scaleYaxis)
    {
	mComponents[5] = scaleYaxis;
    }
    
    public boolean hasScaleYaxis()
    {
	return componentIsPresent(5);
    }
    
    public void deleteScaleYaxis()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[6];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[6] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(6);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type Regional from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
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
			0x0010
		    }
		),
		new QName (
		    "dsrc.dsrc",
		    "ComputedLane$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_ComputedLane,
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
					    dsrc.region.REGION.reg_ComputedLane,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ComputedLane$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_ComputedLane,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "ComputedLane$Regional$Sequence_"
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
	     * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Sequence_

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Sequence_();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ComputedLane$Regional"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(4),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(4)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.dsrc",
		    "ComputedLane$Regional$Sequence_"
		)
	    )
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
	    "ComputedLane"
	),
	new QName (
	    "DSRC",
	    "ComputedLane"
	),
	274454,
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
				"LaneID"
			    ),
			    new QName (
				"DSRC",
				"LaneID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneID(0), 
				    new LaneID(255),
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
		    "referenceLaneId",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ComputedLane$OffsetXaxis"
			)
		    ),
		    "offsetXaxis",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ComputedLane$OffsetYaxis"
			)
		    ),
		    "offsetYaxis",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Angle"
			    ),
			    new QName (
				"DSRC",
				"Angle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Angle(0), 
				    new Angle(28800),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(28800)
			    ),
			    null
			)
		    ),
		    "rotateXY",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Scale_B12"
			    ),
			    new QName (
				"DSRC",
				"Scale-B12"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Scale_B12(-2048), 
				    new Scale_B12(2047),
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
		    "scaleXaxis",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Scale_B12"
			    ),
			    new QName (
				"DSRC",
				"Scale-B12"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Scale_B12(-2048), 
				    new Scale_B12(2047),
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
		    "scaleYaxis",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ComputedLane$Regional"
			)
		    ),
		    "regional",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ComputedLane object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ComputedLane object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ComputedLane
