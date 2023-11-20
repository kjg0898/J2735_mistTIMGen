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
 * Define the ASN1 Type SignalRequesterInfo from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalRequesterInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public SignalRequesterInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalRequesterInfo(VehicleID id, RequestID request, 
		    MsgCount sequenceNumber, BasicVehicleRole role, 
		    RequestorType typeData)
    {
	setId(id);
	setRequest(request);
	setSequenceNumber(sequenceNumber);
	setRole(role);
	setTypeData(typeData);
    }
    
    /**
     * Construct with required components.
     */
    public SignalRequesterInfo(VehicleID id, RequestID request, 
		    MsgCount sequenceNumber)
    {
	setId(id);
	setRequest(request);
	setSequenceNumber(sequenceNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = new VehicleID();
	mComponents[1] = new RequestID();
	mComponents[2] = new MsgCount();
	mComponents[3] = BasicVehicleRole.basicVehicle;
	mComponents[4] = new RequestorType();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new VehicleID();
	    case 1:
		return new RequestID();
	    case 2:
		return new MsgCount();
	    case 3:
		return BasicVehicleRole.basicVehicle;
	    case 4:
		return new RequestorType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "id"
    public VehicleID getId()
    {
	return (VehicleID)mComponents[0];
    }
    
    public void setId(VehicleID id)
    {
	mComponents[0] = id;
    }
    
    
    // Methods for field "request"
    public RequestID getRequest()
    {
	return (RequestID)mComponents[1];
    }
    
    public void setRequest(RequestID request)
    {
	mComponents[1] = request;
    }
    
    
    // Methods for field "sequenceNumber"
    public MsgCount getSequenceNumber()
    {
	return (MsgCount)mComponents[2];
    }
    
    public void setSequenceNumber(MsgCount sequenceNumber)
    {
	mComponents[2] = sequenceNumber;
    }
    
    
    // Methods for field "role"
    public BasicVehicleRole getRole()
    {
	return (BasicVehicleRole)mComponents[3];
    }
    
    public void setRole(BasicVehicleRole role)
    {
	mComponents[3] = role;
    }
    
    public boolean hasRole()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRole()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "typeData"
    public RequestorType getTypeData()
    {
	return (RequestorType)mComponents[4];
    }
    
    public void setTypeData(RequestorType typeData)
    {
	mComponents[4] = typeData;
    }
    
    public boolean hasTypeData()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTypeData()
    {
	setComponentAbsent(4);
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
	    "SignalRequesterInfo"
	),
	new QName (
	    "DSRC",
	    "SignalRequesterInfo"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleID"
			    ),
			    new QName (
				"DSRC",
				"VehicleID"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleID"
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
		    "request",
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
				"MsgCount"
			    ),
			    new QName (
				"DSRC",
				"MsgCount"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MsgCount(0), 
				    new MsgCount(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "sequenceNumber",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"BasicVehicleRole"
			    ),
			    new QName (
				"DSRC",
				"BasicVehicleRole"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"basicVehicle",
					0
				    ),
				    new MemberListElement (
					"publicTransport",
					1
				    ),
				    new MemberListElement (
					"specialTransport",
					2
				    ),
				    new MemberListElement (
					"dangerousGoods",
					3
				    ),
				    new MemberListElement (
					"roadWork",
					4
				    ),
				    new MemberListElement (
					"roadRescue",
					5
				    ),
				    new MemberListElement (
					"emergency",
					6
				    ),
				    new MemberListElement (
					"safetyCar",
					7
				    ),
				    new MemberListElement (
					"none-unknown",
					8
				    ),
				    new MemberListElement (
					"truck",
					9
				    ),
				    new MemberListElement (
					"motorcycle",
					10
				    ),
				    new MemberListElement (
					"roadSideSource",
					11
				    ),
				    new MemberListElement (
					"police",
					12
				    ),
				    new MemberListElement (
					"fire",
					13
				    ),
				    new MemberListElement (
					"ambulance",
					14
				    ),
				    new MemberListElement (
					"dot",
					15
				    ),
				    new MemberListElement (
					"transit",
					16
				    ),
				    new MemberListElement (
					"slowMoving",
					17
				    ),
				    new MemberListElement (
					"stopNgo",
					18
				    ),
				    new MemberListElement (
					"cyclist",
					19
				    ),
				    new MemberListElement (
					"pedestrian",
					20
				    ),
				    new MemberListElement (
					"nonMotorized",
					21
				    ),
				    new MemberListElement (
					"military",
					22
				    )
				}
			    ),
			    0,
			    BasicVehicleRole.basicVehicle
			)
		    ),
		    "role",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RequestorType"
			    ),
			    new QName (
				"DSRC",
				"RequestorType"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RequestorType"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RequestorType"
				)
			    ),
			    0
			)
		    ),
		    "typeData",
		    4,
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
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SignalRequesterInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SignalRequesterInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SignalRequesterInfo
