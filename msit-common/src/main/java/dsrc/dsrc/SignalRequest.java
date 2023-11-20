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
 * Define the ASN1 Type SignalRequest from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public SignalRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalRequest(IntersectionReferenceID id, RequestID requestID, 
		    PriorityRequestType requestType, 
		    IntersectionAccessPoint inBoundLane, 
		    IntersectionAccessPoint outBoundLane, Regional regional)
    {
	setId(id);
	setRequestID(requestID);
	setRequestType(requestType);
	setInBoundLane(inBoundLane);
	setOutBoundLane(outBoundLane);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public SignalRequest(IntersectionReferenceID id, RequestID requestID, 
		    PriorityRequestType requestType, 
		    IntersectionAccessPoint inBoundLane)
    {
	setId(id);
	setRequestID(requestID);
	setRequestType(requestType);
	setInBoundLane(inBoundLane);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntersectionReferenceID();
	mComponents[1] = new RequestID();
	mComponents[2] = PriorityRequestType.priorityRequestTypeReserved;
	mComponents[3] = new IntersectionAccessPoint();
	mComponents[4] = new IntersectionAccessPoint();
	mComponents[5] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new IntersectionReferenceID();
	    case 1:
		return new RequestID();
	    case 2:
		return PriorityRequestType.priorityRequestTypeReserved;
	    case 3:
		return new IntersectionAccessPoint();
	    case 4:
		return new IntersectionAccessPoint();
	    case 5:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "id"
    public IntersectionReferenceID getId()
    {
	return (IntersectionReferenceID)mComponents[0];
    }
    
    public void setId(IntersectionReferenceID id)
    {
	mComponents[0] = id;
    }
    
    
    // Methods for field "requestID"
    public RequestID getRequestID()
    {
	return (RequestID)mComponents[1];
    }
    
    public void setRequestID(RequestID requestID)
    {
	mComponents[1] = requestID;
    }
    
    
    // Methods for field "requestType"
    public PriorityRequestType getRequestType()
    {
	return (PriorityRequestType)mComponents[2];
    }
    
    public void setRequestType(PriorityRequestType requestType)
    {
	mComponents[2] = requestType;
    }
    
    
    // Methods for field "inBoundLane"
    public IntersectionAccessPoint getInBoundLane()
    {
	return (IntersectionAccessPoint)mComponents[3];
    }
    
    public void setInBoundLane(IntersectionAccessPoint inBoundLane)
    {
	mComponents[3] = inBoundLane;
    }
    
    
    // Methods for field "outBoundLane"
    public IntersectionAccessPoint getOutBoundLane()
    {
	return (IntersectionAccessPoint)mComponents[4];
    }
    
    public void setOutBoundLane(IntersectionAccessPoint outBoundLane)
    {
	mComponents[4] = outBoundLane;
    }
    
    public boolean hasOutBoundLane()
    {
	return componentIsPresent(4);
    }
    
    public void deleteOutBoundLane()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[5];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[5] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(5);
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
		    "SignalRequest$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_SignalRequest,
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
					    dsrc.region.REGION.reg_SignalRequest,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "SignalRequest$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_SignalRequest,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "SignalRequest$Regional$Sequence_"
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"SignalRequest$Regional"
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
		    "SignalRequest$Regional$Sequence_"
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
	    "SignalRequest"
	),
	new QName (
	    "DSRC",
	    "SignalRequest"
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
				"IntersectionReferenceID"
			    ),
			    new QName (
				"DSRC",
				"IntersectionReferenceID"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionReferenceID"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionReferenceID"
				)
			    ),
			    0
			)
		    ),
		    "id",
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
				"RequestID"
			    ),
			    new QName (
				"DSRC",
				"RequestID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RequestID(0), 
				    new RequestID(255),
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
		    "requestID",
		    1,
		    2,
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
				"PriorityRequestType"
			    ),
			    new QName (
				"DSRC",
				"PriorityRequestType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"priorityRequestTypeReserved",
					0
				    ),
				    new MemberListElement (
					"priorityRequest",
					1
				    ),
				    new MemberListElement (
					"priorityRequestUpdate",
					2
				    ),
				    new MemberListElement (
					"priorityCancellation",
					3
				    )
				}
			    ),
			    0,
			    PriorityRequestType.priorityRequestTypeReserved
			)
		    ),
		    "requestType",
		    2,
		    2,
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
				"IntersectionAccessPoint"
			    ),
			    new QName (
				"DSRC",
				"IntersectionAccessPoint"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionAccessPoint"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "inBoundLane",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"IntersectionAccessPoint"
			    ),
			    new QName (
				"DSRC",
				"IntersectionAccessPoint"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionAccessPoint"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "outBoundLane",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "SignalRequest$Regional"
			)
		    ),
		    "regional",
		    5,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SignalRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SignalRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SignalRequest
