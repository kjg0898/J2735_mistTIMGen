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
 * Define the ASN1 Type NodeOffsetPointLL from ASN1 Module DSRC.
 * @see Choice
 */

public class NodeOffsetPointLL extends Choice {
    
    /**
     * The default constructor.
     */
    public NodeOffsetPointLL()
    {
    }
    
    public static final  int  node_LL1_chosen = 1;
    public static final  int  node_LL2_chosen = 2;
    public static final  int  node_LL3_chosen = 3;
    public static final  int  node_LL4_chosen = 4;
    public static final  int  node_LL5_chosen = 5;
    public static final  int  node_LL6_chosen = 6;
    public static final  int  node_LatLon_chosen = 7;
    public static final  int  regional_chosen = 8;
    
    // Methods for field "node_LL1"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL1(Node_LL_24B node_LL1)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL1(node_LL1);
	return __object;
    }
    
    public boolean hasNode_LL1()
    {
	return getChosenFlag() == node_LL1_chosen;
    }
    
    public Node_LL_24B getNode_LL1()
    {
	if (hasNode_LL1())
	    return (Node_LL_24B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL1(Node_LL_24B node_LL1)
    {
	setChosenValue(node_LL1);
	setChosenFlag(node_LL1_chosen);
    }
    
    
    // Methods for field "node_LL2"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL2(Node_LL_28B node_LL2)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL2(node_LL2);
	return __object;
    }
    
    public boolean hasNode_LL2()
    {
	return getChosenFlag() == node_LL2_chosen;
    }
    
    public Node_LL_28B getNode_LL2()
    {
	if (hasNode_LL2())
	    return (Node_LL_28B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL2(Node_LL_28B node_LL2)
    {
	setChosenValue(node_LL2);
	setChosenFlag(node_LL2_chosen);
    }
    
    
    // Methods for field "node_LL3"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL3(Node_LL_32B node_LL3)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL3(node_LL3);
	return __object;
    }
    
    public boolean hasNode_LL3()
    {
	return getChosenFlag() == node_LL3_chosen;
    }
    
    public Node_LL_32B getNode_LL3()
    {
	if (hasNode_LL3())
	    return (Node_LL_32B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL3(Node_LL_32B node_LL3)
    {
	setChosenValue(node_LL3);
	setChosenFlag(node_LL3_chosen);
    }
    
    
    // Methods for field "node_LL4"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL4(Node_LL_36B node_LL4)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL4(node_LL4);
	return __object;
    }
    
    public boolean hasNode_LL4()
    {
	return getChosenFlag() == node_LL4_chosen;
    }
    
    public Node_LL_36B getNode_LL4()
    {
	if (hasNode_LL4())
	    return (Node_LL_36B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL4(Node_LL_36B node_LL4)
    {
	setChosenValue(node_LL4);
	setChosenFlag(node_LL4_chosen);
    }
    
    
    // Methods for field "node_LL5"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL5(Node_LL_44B node_LL5)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL5(node_LL5);
	return __object;
    }
    
    public boolean hasNode_LL5()
    {
	return getChosenFlag() == node_LL5_chosen;
    }
    
    public Node_LL_44B getNode_LL5()
    {
	if (hasNode_LL5())
	    return (Node_LL_44B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL5(Node_LL_44B node_LL5)
    {
	setChosenValue(node_LL5);
	setChosenFlag(node_LL5_chosen);
    }
    
    
    // Methods for field "node_LL6"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LL6(Node_LL_48B node_LL6)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

	__object.setNode_LL6(node_LL6);
	return __object;
    }
    
    public boolean hasNode_LL6()
    {
	return getChosenFlag() == node_LL6_chosen;
    }
    
    public Node_LL_48B getNode_LL6()
    {
	if (hasNode_LL6())
	    return (Node_LL_48B)mChosenValue;
	else
	    return null;
    }
    
    public void setNode_LL6(Node_LL_48B node_LL6)
    {
	setChosenValue(node_LL6);
	setChosenFlag(node_LL6_chosen);
    }
    
    
    // Methods for field "node_LatLon"
    public static NodeOffsetPointLL createNodeOffsetPointLLWithNode_LatLon(Node_LLmD_64b node_LatLon)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

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
    public static NodeOffsetPointLL createNodeOffsetPointLLWithRegional(Regional regional)
    {
	NodeOffsetPointLL __object = new NodeOffsetPointLL();

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
		"NodeOffsetPointLL$Regional"
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
					dsrc.region.REGION.reg_NodeOffsetPointLL,
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
					dsrc.region.REGION.reg_NodeOffsetPointLL,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"NodeOffsetPointLL$Regional"
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
					dsrc.region.REGION.reg_NodeOffsetPointLL,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"NodeOffsetPointLL$Regional"
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
	    case node_LL1_chosen:
		return new Node_LL_24B();
	    case node_LL2_chosen:
		return new Node_LL_28B();
	    case node_LL3_chosen:
		return new Node_LL_32B();
	    case node_LL4_chosen:
		return new Node_LL_36B();
	    case node_LL5_chosen:
		return new Node_LL_44B();
	    case node_LL6_chosen:
		return new Node_LL_48B();
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
	    "NodeOffsetPointLL"
	),
	new QName (
	    "DSRC",
	    "NodeOffsetPointLL"
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
				"Node_LL_24B"
			    ),
			    new QName (
				"DSRC",
				"Node-LL-24B"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_24B"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_24B"
				)
			    ),
			    0
			)
		    ),
		    "node-LL1",
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
				"Node_LL_28B"
			    ),
			    new QName (
				"DSRC",
				"Node-LL-28B"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_28B"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_28B"
				)
			    ),
			    0
			)
		    ),
		    "node-LL2",
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
				"Node_LL_32B"
			    ),
			    new QName (
				"DSRC",
				"Node-LL-32B"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_32B"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_32B"
				)
			    ),
			    0
			)
		    ),
		    "node-LL3",
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
				"Node_LL_36B"
			    ),
			    new QName (
				"DSRC",
				"Node-LL-36B"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_36B"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_36B"
				)
			    ),
			    0
			)
		    ),
		    "node-LL4",
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
				"Node_LL_44B"
			    ),
			    new QName (
				"DSRC",
				"Node-LL-44B"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_44B"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_44B"
				)
			    ),
			    0
			)
		    ),
		    "node-LL5",
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
				"Node_LL_48B"
			    ),
			    new QName (
				"DSRC",
				"Node-LL-48B"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_48B"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Node_LL_48B"
				)
			    ),
			    0
			)
		    ),
		    "node-LL6",
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
			    "NodeOffsetPointLL$Regional"
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
     * Get the type descriptor (TypeInfo) of 'this' NodeOffsetPointLL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NodeOffsetPointLL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NodeOffsetPointLL
