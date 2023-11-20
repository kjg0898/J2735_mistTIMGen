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
 * Define the ASN1 Type Connection from ASN1 Module DSRC.
 * @see Sequence
 */

public class Connection extends Sequence {
    
    /**
     * The default constructor.
     */
    public Connection()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Connection(ConnectingLane connectingLane, 
		    IntersectionReferenceID remoteIntersection, 
		    SignalGroupID signalGroup, RestrictionClassID userClass, 
		    LaneConnectionID connectionID)
    {
	setConnectingLane(connectingLane);
	setRemoteIntersection(remoteIntersection);
	setSignalGroup(signalGroup);
	setUserClass(userClass);
	setConnectionID(connectionID);
    }
    
    /**
     * Construct with required components.
     */
    public Connection(ConnectingLane connectingLane)
    {
	setConnectingLane(connectingLane);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ConnectingLane();
	mComponents[1] = new IntersectionReferenceID();
	mComponents[2] = new SignalGroupID();
	mComponents[3] = new RestrictionClassID();
	mComponents[4] = new LaneConnectionID();
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
		return new ConnectingLane();
	    case 1:
		return new IntersectionReferenceID();
	    case 2:
		return new SignalGroupID();
	    case 3:
		return new RestrictionClassID();
	    case 4:
		return new LaneConnectionID();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "connectingLane"
    public ConnectingLane getConnectingLane()
    {
	return (ConnectingLane)mComponents[0];
    }
    
    public void setConnectingLane(ConnectingLane connectingLane)
    {
	mComponents[0] = connectingLane;
    }
    
    
    // Methods for field "remoteIntersection"
    public IntersectionReferenceID getRemoteIntersection()
    {
	return (IntersectionReferenceID)mComponents[1];
    }
    
    public void setRemoteIntersection(IntersectionReferenceID remoteIntersection)
    {
	mComponents[1] = remoteIntersection;
    }
    
    public boolean hasRemoteIntersection()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRemoteIntersection()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "signalGroup"
    public SignalGroupID getSignalGroup()
    {
	return (SignalGroupID)mComponents[2];
    }
    
    public void setSignalGroup(SignalGroupID signalGroup)
    {
	mComponents[2] = signalGroup;
    }
    
    public boolean hasSignalGroup()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSignalGroup()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "userClass"
    public RestrictionClassID getUserClass()
    {
	return (RestrictionClassID)mComponents[3];
    }
    
    public void setUserClass(RestrictionClassID userClass)
    {
	mComponents[3] = userClass;
    }
    
    public boolean hasUserClass()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUserClass()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "connectionID"
    public LaneConnectionID getConnectionID()
    {
	return (LaneConnectionID)mComponents[4];
    }
    
    public void setConnectionID(LaneConnectionID connectionID)
    {
	mComponents[4] = connectionID;
    }
    
    public boolean hasConnectionID()
    {
	return componentIsPresent(4);
    }
    
    public void deleteConnectionID()
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
	    "Connection"
	),
	new QName (
	    "DSRC",
	    "Connection"
	),
	274450,
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
				"ConnectingLane"
			    ),
			    new QName (
				"DSRC",
				"ConnectingLane"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "ConnectingLane"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "ConnectingLane"
				)
			    ),
			    0
			)
		    ),
		    "connectingLane",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "remoteIntersection",
		    1,
		    3,
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
				"SignalGroupID"
			    ),
			    new QName (
				"DSRC",
				"SignalGroupID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SignalGroupID(0), 
				    new SignalGroupID(255),
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
		    "signalGroup",
		    2,
		    3,
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
				"RestrictionClassID"
			    ),
			    new QName (
				"DSRC",
				"RestrictionClassID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RestrictionClassID(0), 
				    new RestrictionClassID(255),
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
		    "userClass",
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
				"LaneConnectionID"
			    ),
			    new QName (
				"DSRC",
				"LaneConnectionID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneConnectionID(0), 
				    new LaneConnectionID(255),
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
		    "connectionID",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' Connection object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Connection object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Connection
