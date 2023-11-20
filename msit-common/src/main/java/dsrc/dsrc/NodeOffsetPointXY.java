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
 * Define the ASN1 Type NodeOffsetPointXY from ASN1 Module DSRC.
 * @see Choice
 */

public class NodeOffsetPointXY extends Choice {
    
    /**
     * The default constructor.
     */
    public NodeOffsetPointXY()
    {
    }
    
    public static final  int  node_XY1_chosen = 1;
    public static final  int  node_XY2_chosen = 2;
    public static final  int  node_XY3_chosen = 3;
    public static final  int  node_XY4_chosen = 4;
    public static final  int  node_XY5_chosen = 5;
    public static final  int  node_XY6_chosen = 6;
    public static final  int  node_LatLon_chosen = 7;
    public static final  int  regional_chosen = 8;
    
    // Methods for field "node_XY1"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY1(Node_XY_20b node_XY1)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY1(node_XY1);
	return __object;
    }
    
    public boolean hasNode_XY1()
    {
	return getChosenFlag() == node_XY1_chosen;
    }
    
    public Node_XY_20b getNode_XY1()
    {
	if (hasNode_XY1())
	    return (Node_XY_20b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY1(Node_XY_20b node_XY1)
    {
	setChosenValue(node_XY1);
	setChosenFlag(node_XY1_chosen);
    }
    
    
    // Methods for field "node_XY2"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY2(Node_XY_22b node_XY2)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY2(node_XY2);
	return __object;
    }
    
    public boolean hasNode_XY2()
    {
	return getChosenFlag() == node_XY2_chosen;
    }
    
    public Node_XY_22b getNode_XY2()
    {
	if (hasNode_XY2())
	    return (Node_XY_22b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY2(Node_XY_22b node_XY2)
    {
	setChosenValue(node_XY2);
	setChosenFlag(node_XY2_chosen);
    }
    
    
    // Methods for field "node_XY3"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY3(Node_XY_24b node_XY3)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY3(node_XY3);
	return __object;
    }
    
    public boolean hasNode_XY3()
    {
	return getChosenFlag() == node_XY3_chosen;
    }
    
    public Node_XY_24b getNode_XY3()
    {
	if (hasNode_XY3())
	    return (Node_XY_24b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY3(Node_XY_24b node_XY3)
    {
	setChosenValue(node_XY3);
	setChosenFlag(node_XY3_chosen);
    }
    
    
    // Methods for field "node_XY4"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY4(Node_XY_26b node_XY4)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY4(node_XY4);
	return __object;
    }
    
    public boolean hasNode_XY4()
    {
	return getChosenFlag() == node_XY4_chosen;
    }
    
    public Node_XY_26b getNode_XY4()
    {
	if (hasNode_XY4())
	    return (Node_XY_26b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY4(Node_XY_26b node_XY4)
    {
	setChosenValue(node_XY4);
	setChosenFlag(node_XY4_chosen);
    }
    
    
    // Methods for field "node_XY5"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY5(Node_XY_28b node_XY5)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY5(node_XY5);
	return __object;
    }
    
    public boolean hasNode_XY5()
    {
	return getChosenFlag() == node_XY5_chosen;
    }
    
    public Node_XY_28b getNode_XY5()
    {
	if (hasNode_XY5())
	    return (Node_XY_28b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY5(Node_XY_28b node_XY5)
    {
	setChosenValue(node_XY5);
	setChosenFlag(node_XY5_chosen);
    }
    
    
    // Methods for field "node_XY6"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_XY6(Node_XY_32b node_XY6)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_XY6(node_XY6);
	return __object;
    }
    
    public boolean hasNode_XY6()
    {
	return getChosenFlag() == node_XY6_chosen;
    }
    
    public Node_XY_32b getNode_XY6()
    {
	if (hasNode_XY6())
	    return (Node_XY_32b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_XY6(Node_XY_32b node_XY6)
    {
	setChosenValue(node_XY6);
	setChosenFlag(node_XY6_chosen);
    }
    
    
    // Methods for field "node_LatLon"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithNode_LatLon(Node_LLmD_64b node_LatLon)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

	__object.setNode_LatLon(node_LatLon);
	return __object;
    }
    
    public boolean hasNode_LatLon()
    {
	return getChosenFlag() == node_LatLon_chosen;
    }
    
    public Node_LLmD_64b getNode_LatLon()
    {
	if (hasNode_LatLon())
	    return (Node_LLmD_64b)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LatLon(Node_LLmD_64b node_LatLon)
    {
	setChosenValue(node_LatLon);
	setChosenFlag(node_LatLon_chosen);
    }
    
    
    // Methods for field "regional"
    public static NodeOffsetPointXY createNodeOffsetPointXYWithRegional(Regional regional)
    {
	NodeOffsetPointXY __object = new NodeOffsetPointXY();

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
		"NodeOffsetPointXY$Regional"
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
					dsrc.region.REGION.reg_NodeOffsetPointXY,
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
					dsrc.region.REGION.reg_NodeOffsetPointXY,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"NodeOffsetPointXY$Regional"
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
					dsrc.region.REGION.reg_NodeOffsetPointXY,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"NodeOffsetPointXY$Regional"
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
	    case node_XY1_chosen:
		return new Node_XY_20b();
	    case node_XY2_chosen:
		return new Node_XY_22b();
	    case node_XY3_chosen:
		return new Node_XY_24b();
	    case node_XY4_chosen:
		return new Node_XY_26b();
	    case node_XY5_chosen:
		return new Node_XY_28b();
	    case node_XY6_chosen:
		return new Node_XY_32b();
	    case node_LatLon_chosen:
		return new Node_LLmD_64b();
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
	    "NodeOffsetPointXY"
	),
	new QName (
	    "DSRC",
	    "NodeOffsetPointXY"
	),
	274450,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Node_XY_20b"
			    ),
			    new QName (
				"DSRC",
				"Node-XY-20b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_20b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_20b"
				)
			    ),
			    0
			)
		    ),
		    "node-XY1",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Node_XY_22b"
			    ),
			    new QName (
				"DSRC",
				"Node-XY-22b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_22b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_22b"
				)
			    ),
			    0
			)
		    ),
		    "node-XY2",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Node_XY_24b"
			    ),
			    new QName (
				"DSRC",
				"Node-XY-24b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_24b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_24b"
				)
			    ),
			    0
			)
		    ),
		    "node-XY3",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Node_XY_26b"
			    ),
			    new QName (
				"DSRC",
				"Node-XY-26b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_26b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_26b"
				)
			    ),
			    0
			)
		    ),
		    "node-XY4",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Node_XY_28b"
			    ),
			    new QName (
				"DSRC",
				"Node-XY-28b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_28b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_28b"
				)
			    ),
			    0
			)
		    ),
		    "node-XY5",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Node_XY_32b"
			    ),
			    new QName (
				"DSRC",
				"Node-XY-32b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_32b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_XY_32b"
				)
			    ),
			    0
			)
		    ),
		    "node-XY6",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Node_LLmD_64b"
			    ),
			    new QName (
				"DSRC",
				"Node-LLmD-64b"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LLmD_64b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LLmD_64b"
				)
			    ),
			    0
			)
		    ),
		    "node-LatLon",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "NodeOffsetPointXY$Regional"
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
     * Get the type descriptor (TypeInfo) of 'this' NodeOffsetPointXY object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NodeOffsetPointXY object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NodeOffsetPointXY
