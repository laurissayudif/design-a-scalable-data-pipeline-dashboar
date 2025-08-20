import java.util.ArrayList;
import java.util.List;

public class qxm4_design_a_scalab {
    // Data Model: Scalable Data Pipeline Dashboard
    public static class Pipeline {
        private String id;
        private String name;
        private List<Stage> stages;

        public Pipeline(String id, String name) {
            this.id = id;
            this.name = name;
            this.stages = new ArrayList<>();
        }

        public void addStage(Stage stage) {
            stages.add(stage);
        }

        public List<Stage> getStages() {
            return stages;
        }
    }

    public static class Stage {
        private String id;
        private String name;
        private List<DataFlow> dataFlows;

        public Stage(String id, String name) {
            this.id = id;
            this.name = name;
            this.dataFlows = new ArrayList<>();
        }

        public void addDataFlow(DataFlow dataFlow) {
            dataFlows.add(dataFlow);
        }

        public List<DataFlow> getDataFlows() {
            return dataFlows;
        }
    }

    public static class DataFlow {
        private String id;
        private String source;
        private String destination;
        private String transform;

        public DataFlow(String id, String source, String destination, String transform) {
            this.id = id;
            this.source = source;
            this.destination = destination;
            this.transform = transform;
        }
    }

    public static class Dashboard {
        private List<Pipeline> pipelines;

        public Dashboard() {
            this.pipelines = new ArrayList<>();
        }

        public void addPipeline(Pipeline pipeline) {
            pipelines.add(pipeline);
        }

        public List<Pipeline> getPipelines() {
            return pipelines;
        }
    }
}