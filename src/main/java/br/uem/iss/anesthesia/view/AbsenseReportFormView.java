package br.uem.iss.anesthesia.view;

<<<<<<< HEAD
import br.uem.iss.anesthesia.controller.request.PatientReportRequest;
import br.uem.iss.anesthesia.controller.request.ProcessReportRequest;
import br.uem.iss.anesthesia.model.entity.DoctorModel;
import br.uem.iss.anesthesia.model.entity.PatientModel;
=======
import br.uem.iss.anesthesia.controller.request.ProcessReportRequest;
>>>>>>> f2cb81d5208346219204bead1f48e680b0c4c620
import br.uem.iss.anesthesia.model.entity.ProcessModel;

public class AbsenseReportFormView extends AbstractModelAndView {

    public AbsenseReportFormView(ProcessReportRequest processReportRequest, Iterable<ProcessModel> process) {
        super("form_absense-report", "filter", processReportRequest);
        addObject("process", process);
    }
}
