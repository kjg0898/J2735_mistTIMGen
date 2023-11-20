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
 * Define the ASN1 Type ShapePointSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class ShapePointSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public ShapePointSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ShapePointSet(Position3D anchor, LaneWidth laneWidth, 
		    DirectionOfUse directionality, NodeListXY nodeList)
    {
	setAnchor(anchor);
	setLaneWidth(laneWidth);
	setDirectionality(directionality);
	setNodeList(nodeList);
    }
    
    /**
     * Construct with required components.
     */
    public ShapePointSet(NodeListXY nodeList)
    {
	setNodeList(nodeList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Position3D();
	mComponents[1] = new LaneWidth();
	mComponents[2] = DirectionOfUse.unavailable;
	mComponents[3] = new NodeListXY();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Position3D();
	    case 1:
		return new LaneWidth();
	    case 2:
		return DirectionOfUse.unavailable;
	    case 3:
		return new NodeListXY();
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
    
    
    // Methods for field "laneWidth"
    public LaneWidth getLaneWidth()
    {
	return (LaneWidth)mComponents[1];
    }
    
    public void setLaneWidth(LaneWidth laneWidth)
    {
	mComponents[1] = laneWidth;
    }
    
    public boolean hasLaneWidth()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLaneWidth()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "directionality"
    public DirectionOfUse getDirectionality()
    {
	return (DirectionOfUse)mComponents[2];
    }
    
    public void setDirectionality(DirectionOfUse directionality)
    {
	mComponents[2] = directionality;
    }
    
    public boolean hasDirectionality()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDirectionality()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "nodeList"
    public NodeListXY getNodeList()
    {
	return (NodeListXY)mComponents[3];
    }
    
    public void setNodeList(NodeListXY nodeList)
    {
	mComponents[3] = nodeList;
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
	    "ShapePointSet"
	),
	new QName (
	    "DSRC",
	    "ShapePointSet"
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
				"LaneWidth"
			    ),
			    new QName (
				"DSRC",
				"LaneWidth"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneWidth(0), 
				    new LaneWidth(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "laneWidth",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DirectionOfUse"
			    ),
			    new QName (
				"DSRC",
				"DirectionOfUse"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"forward",
					1
				    ),
				    new MemberListElement (
					"reverse",
					2
				    ),
				    new MemberListElement (
					"both",
					3
				    )
				}
			    ),
			    0,
			    DirectionOfUse.unavailable
			)
		    ),
		    "directionality",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"NodeListXY"
			    ),
			    new QName (
				"DSRC",
				"NodeListXY"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "NodeListXY"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "nodeList",
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ShapePointSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ShapePointSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ShapePointSet
