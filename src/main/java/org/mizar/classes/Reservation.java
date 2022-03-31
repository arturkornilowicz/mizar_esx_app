package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Reservation extends Item {

    private List<ReservationSegment> segments = new LinkedList<>();

    public Reservation(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.RESERVATION_SEGMENT)) {
            segments.add(new ReservationSegment(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (ReservationSegment reservationSegment: segments) {
            reservationSegment.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
