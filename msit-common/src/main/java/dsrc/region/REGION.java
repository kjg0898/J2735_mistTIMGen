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


package dsrc.region;

import com.oss.asn1.ASN1Module;
import com.oss.asn1.ASN1Type;

public abstract class REGION extends ASN1Module {

    
    
    // Information object sets
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_AdvisorySpeed = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-AdvisorySpeed"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ComputedLane = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-ComputedLane"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_EventDescription = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-EventDescription"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_GenericLane = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-GenericLane"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_GeographicalPath = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-GeographicalPath"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_GeometricProjection = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-GeometricProjection"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_IntersectionGeometry = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-IntersectionGeometry"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_LaneAttributes = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-LaneAttributes"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_MovementState = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-MovementState"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeAttributeSetLL = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-NodeAttributeSetLL"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeAttributeSetXY = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-NodeAttributeSetXY"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeOffsetPointLL = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-NodeOffsetPointLL"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RequestorDescription = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-RequestorDescription"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RequestorType = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-RequestorType"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RoadSegment = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-RoadSegment"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalControlZone = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SignalControlZone"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalRequest = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SignalRequest"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalRequestPackage = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SignalRequestPackage"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalStatus = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SignalStatus"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalStatusPackage = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SignalStatusPackage"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SupplementalVehicleExtensions = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SupplementalVehicleExtensions"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_VehicleClassification = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-VehicleClassification"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_VerticalOffset = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-VerticalOffset"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ConnectionManeuverAssist = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(3),
		    new ASN1Type (
			"dsrc.addgrpc",
			"ConnectionManeuverAssist_addGrpC"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-ConnectionManeuverAssist"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_IntersectionState = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(3),
		    new ASN1Type (
			"dsrc.addgrpc",
			"IntersectionState_addGrpC"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-IntersectionState"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_LaneDataAttribute = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(2),
		    new ASN1Type (
			"dsrc.addgrpb",
			"LaneDataAttribute_addGrpB"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-LaneDataAttribute"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_MovementEvent = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(2),
		    new ASN1Type (
			"dsrc.addgrpb",
			"MovementEvent_addGrpB"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-MovementEvent"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NodeOffsetPointXY = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(2),
		    new ASN1Type (
			"dsrc.addgrpb",
			"NodeOffsetPointXY_addGrpB"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-NodeOffsetPointXY"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_Position3D = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(2),
		    new ASN1Type (
			"dsrc.addgrpb",
			"Position3D_addGrpB"
		    )
		),
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(3),
		    new ASN1Type (
			"dsrc.addgrpc",
			"Position3D_addGrpC"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-Position3D"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RestrictionUserType = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(3),
		    new ASN1Type (
			"dsrc.addgrpc",
			"RestrictionUserType_addGrpC"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-RestrictionUserType"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_BasicSafetyMessage = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(4),
		    new ASN1Type (
			"dsrc.addgrpd",
			"BSM_addGrpD"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-BasicSafetyMessage"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_CommonSafetyRequest = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-CommonSafetyRequest"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_EmergencyVehicleAlert = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-EmergencyVehicleAlert"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_IntersectionCollision = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-IntersectionCollision"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_NMEAcorrections = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-NMEAcorrections"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ProbeDataManagement = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-ProbeDataManagement"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_ProbeVehicleData = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(4),
		    new ASN1Type (
			"dsrc.addgrpd",
			"PVD_addGrpD"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-ProbeVehicleData"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RoadSideAlert = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(4),
		    new ASN1Type (
			"dsrc.addgrpd",
			"RSA_addGrpD"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-RoadSideAlert"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_RTCMcorrections = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-RTCMcorrections"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalRequestMessage = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SignalRequestMessage"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SignalStatusMessage = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SignalStatusMessage"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_SPAT = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-SPAT"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TravelerInformation = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(4),
		    new ASN1Type (
			"dsrc.addgrpd",
			"TIM_addGrpD"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-TravelerInformation"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_PersonalSafetyMessage = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-PersonalSafetyMessage"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_MapData = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {
		new dsrc.dsrc.REG_EXT_ID_AND_TYPE (
		    new dsrc.dsrc.RegionId(3),
		    new ASN1Type (
			"dsrc.addgrpc",
			"MapData_addGrpC"
		    )
		)
	    },
	    1,
	    "REGION",
	    "Reg-MapData"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage00 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage00"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage01 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage01"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage02 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage02"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage03 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage03"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage04 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage04"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage05 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage05"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage06 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage06"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage07 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage07"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage08 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage08"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage09 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage09"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage10 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage10"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage11 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage11"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage12 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage12"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage13 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage13"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage14 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage14"
	);
    public static dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET reg_TestMessage15 = 
	new dsrc.dsrc.REG_EXT_ID_AND_TYPE_OSET (
	    new dsrc.dsrc.REG_EXT_ID_AND_TYPE[] {},
	    1,
	    "REGION",
	    "Reg-TestMessage15"
	);
    
}
