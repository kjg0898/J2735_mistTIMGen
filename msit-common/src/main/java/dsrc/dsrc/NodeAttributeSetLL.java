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
 * Define the ASN1 Type NodeAttributeSetLL from ASN1 Module DSRC.
 * @see Sequence
 */

public class NodeAttributeSetLL extends Sequence {
    
    /**
     * The default constructor.
     */
    public NodeAttributeSetLL()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NodeAttributeSetLL(NodeAttributeLLList localNode, 
		    SegmentAttributeLLList disabled, 
		    SegmentAttributeLLList enabled, 
		    LaneDataAttributeList data, Offset_B10 dWidth, 
		    Offset_B10 dElevation, Regional regional)
    {
	setLocalNode(localNode);
	setDisabled(disabled);
	setEnabled(enabled);
	setData(data);
	setDWidth(dWidth);
	setDElevation(dElevation);
	setRegional(regional);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NodeAttributeLLList();
	mComponents[1] = new SegmentAttributeLLList();
	mComponents[2] = new SegmentAttributeLLList();
	mComponents[3] = new LaneDataAttributeList();
	mComponents[4] = new Offset_B10();
	mComponents[5] = new Offset_B10();
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
		return new NodeAttributeLLList();
	    case 1:
		return new SegmentAttributeLLList();
	    case 2:
		return new SegmentAttributeLLList();
	    case 3:
		return new LaneDataAttributeList();
	    case 4:
		return new Offset_B10();
	    case 5:
		return new Offset_B10();
	    case 6:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "localNode"
    public NodeAttributeLLList getLocalNode()
    {
	return (NodeAttributeLLList)mComponents[0];
    }
    
    public void setLocalNode(NodeAttributeLLList localNode)
    {
	mComponents[0] = localNode;
    }
    
    public boolean hasLocalNode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLocalNode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "disabled"
    public SegmentAttributeLLList getDisabled()
    {
	return (SegmentAttributeLLList)mComponents[1];
    }
    
    public void setDisabled(SegmentAttributeLLList disabled)
    {
	mComponents[1] = disabled;
    }
    
    public boolean hasDisabled()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDisabled()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "enabled"
    public SegmentAttributeLLList getEnabled()
    {
	return (SegmentAttributeLLList)mComponents[2];
    }
    
    public void setEnabled(SegmentAttributeLLList enabled)
    {
	mComponents[2] = enabled;
    }
    
    public boolean hasEnabled()
    {
	return componentIsPresent(2);
    }
    
    public void deleteEnabled()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "data"
    public LaneDataAttributeList getData()
    {
	return (LaneDataAttributeList)mComponents[3];
    }
    
    public void setData(LaneDataAttributeList data)
    {
	mComponents[3] = data;
    }
    
    public boolean hasData()
    {
	return componentIsPresent(3);
    }
    
    public void deleteData()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "dWidth"
    public Offset_B10 getDWidth()
    {
	return (Offset_B10)mComponents[4];
    }
    
    public void setDWidth(Offset_B10 dWidth)
    {
	mComponents[4] = dWidth;
    }
    
    public boolean hasDWidth()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDWidth()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "dElevation"
    public Offset_B10 getDElevation()
    {
	return (Offset_B10)mComponents[5];
    }
    
    public void setDElevation(Offset_B10 dElevation)
    {
	mComponents[5] = dElevation;
    }
    
    public boolean hasDElevation()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDElevation()
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
		    "NodeAttributeSetLL$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_NodeAttributeSetLL,
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
					    dsrc.region.REGION.reg_NodeAttributeSetLL,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "NodeAttributeSetLL$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_NodeAttributeSetLL,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "NodeAttributeSetLL$Regional$Sequence_"
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
		"NodeAttributeSetLL$Regional"
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
		    "NodeAttributeSetLL$Regional$Sequence_"
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
	    "NodeAttributeSetLL"
	),
	new QName (
	    "DSRC",
	    "NodeAttributeSetLL"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"NodeAttributeLLList"
			    ),
			    new QName (
				"DSRC",
				"NodeAttributeLLList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "NodeAttributeLL"
				)
			    )
			)
		    ),
		    "localNode",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SegmentAttributeLLList"
			    ),
			    new QName (
				"DSRC",
				"SegmentAttributeLLList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "SegmentAttributeLL"
				)
			    )
			)
		    ),
		    "disabled",
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
				"SegmentAttributeLLList"
			    ),
			    new QName (
				"DSRC",
				"SegmentAttributeLLList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "SegmentAttributeLL"
				)
			    )
			)
		    ),
		    "enabled",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneDataAttributeList"
			    ),
			    new QName (
				"DSRC",
				"LaneDataAttributeList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "LaneDataAttribute"
				)
			    )
			)
		    ),
		    "data",
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
				"Offset_B10"
			    ),
			    new QName (
				"DSRC",
				"Offset-B10"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B10(-512), 
				    new Offset_B10(511),
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
		    "dWidth",
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
				"Offset_B10"
			    ),
			    new QName (
				"DSRC",
				"Offset-B10"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B10(-512), 
				    new Offset_B10(511),
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
		    "dElevation",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "NodeAttributeSetLL$Regional"
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
     * Get the type descriptor (TypeInfo) of 'this' NodeAttributeSetLL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NodeAttributeSetLL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NodeAttributeSetLL
