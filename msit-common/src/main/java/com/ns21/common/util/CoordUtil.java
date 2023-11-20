package com.ns21.common.util;


import dsrc.dsrc.Elevation;
import dsrc.dsrc.Latitude;
import dsrc.dsrc.Longitude;
import dsrc.dsrc.Position3D;

/**
 * packageName    : com.ns21.common.util
 * fileName       : CoordUtil.java
 * author         : kimhansol
 * date           : 2023-08-28
 * description    : 좌표 변환 util
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-28        kimhansol       최초 생성
 */
public class CoordUtil {

    public static Position3D position(double lat, double lon) {
        Position3D position3D = new Position3D();

        int x = (int)(lat * 10000000);
        int y = (int)(lon * 10000000);
        long z = 0;

        position3D.setLat(new Latitude(x));
        position3D.set_long(new Longitude(y));
        position3D.setElevation(new Elevation(z));

        return position3D;
    }
}
