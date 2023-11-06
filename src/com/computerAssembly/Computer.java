package com.computerAssembly;

import com.componentModels.*;
import com.computerComponents.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Computer {

    private Case pcCase;
    private Mouse mouse;
    private Keyboard keyboard;
    private HDD hdd;
    private SSD ssd;
    private Monitor monitor;
    private VideoCard videoCard;
    private Motherboard motherboard;

    private boolean isAssemblingFinished = false;
    private boolean isAssemblingStarted = false;

    private final List<Object> addedComponents = new ArrayList<Object>();

    public void startAssembly() {
        Scanner scanner = new Scanner(System.in);
        while (!isAssemblingFinished) {
            if (!isAssemblingStarted) {
                System.out.println("Бажаєте розпочати збірку комп'ютера? +/-");
                isAssemblingStarted = true;
            } else {
                System.out.println("Бажаєте продовжити збірку комп'ютера? +/-");
            }
            if (scanner.next().equals("+")) {
                System.out.println("Оберіть компонент: ");
                System.out.println("1: Корпус");
                System.out.println("2: Мишка");
                System.out.println("3: Клавіатура");
                System.out.println("4: HDD");
                System.out.println("5: SSD");
                System.out.println("6: Монітор");
                System.out.println("7: Відеокарта");
                System.out.println("8: Материнська плата");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Оберіть корпус: ");
                        showComponentModels();
                        int caseChoice = scanner.nextInt();
                        Case pcCase = new Case(choiceComponentModel(caseChoice));
                        setPcCase(pcCase);
                        addedComponents.add(pcCase);
                        System.out.println("Корпус успішно додано до комп'ютера!");
                        break;
                    case 2:
                        System.out.println("Оберіть мишку: ");
                        showComponentModels();
                        int mouseChoice = scanner.nextInt();
                        Mouse mouse = new Mouse(choiceComponentModel(mouseChoice));
                        setMouse(mouse);
                        addedComponents.add(mouse);
                        System.out.println("Мишку успішно додано до комп'ютера!");
                        break;
                    case 3:
                        System.out.println("Оберіть клавіатуру: ");
                        showComponentModels();
                        int keyboardChoice = scanner.nextInt();
                        Keyboard keyboard = new Keyboard(choiceComponentModel(keyboardChoice));
                        setKeyboard(keyboard);
                        addedComponents.add(keyboard);
                        System.out.println("Клавіатуру успішно додано до комп'ютера!");
                        break;
                    case 4:
                        System.out.println("Оберіть HDD: ");
                        showComponentModels();
                        int hddChoice = scanner.nextInt();
                        HDD hdd = new HDD(choiceComponentModel(hddChoice));
                        setHdd(hdd);
                        addedComponents.add(hdd);
                        System.out.println("HDD успішно додано до комп'ютера!");
                        break;
                    case 5:
                        System.out.println("Оберіть SSD: ");
                        showComponentModels();
                        int ssdChoice = scanner.nextInt();
                        SSD ssd = new SSD(choiceComponentModel(ssdChoice));
                        setSsd(ssd);
                        addedComponents.add(ssd);
                        System.out.println("SSD успішно додано до комп'ютера!");
                        break;
                    case 6:
                        System.out.println("Оберіть монітор: ");
                        showComponentModels();
                        int monitorChoice = scanner.nextInt();
                        Monitor monitor = new Monitor(choiceComponentModel(monitorChoice));
                        setMonitor(monitor);
                        addedComponents.add(monitor);
                        System.out.println("Монітор успішно додано до комп'ютера!");
                        break;
                    case 7:
                        System.out.println("Оберіть відеокарту: ");
                        showComponentModels();
                        int videocardChoice = scanner.nextInt();
                        VideoCard videoCard = new VideoCard(choiceComponentModel(videocardChoice));
                        setVideoCard(videoCard);
                        addedComponents.add(videoCard);
                        System.out.println("Відеокарту успішно додано до комп'ютера!");
                        break;
                    case 8:
                        System.out.println("Оберіть материнську плату: ");
                        showComponentModels();
                        int motherboardChoice = scanner.nextInt();
                        Motherboard.MotherboardBuilder motherboardBuilder = new Motherboard.MotherboardBuilder();
                        System.out.println("Оберіть процесор для материнської плати: ");
                        showComponentModels();
                        int processorChoice = scanner.nextInt();
                        motherboardBuilder.setProcessor(new Processor(choiceComponentModel(processorChoice)));
                        System.out.println("Оберіть RAM для материнської плати: ");
                        showComponentModels();
                        int ramChoice = scanner.nextInt();
                        motherboardBuilder.setRAM(new RAM(choiceComponentModel(ramChoice)));
                        Motherboard motherboard = motherboardBuilder.build(choiceComponentModel(motherboardChoice));
                        setMotherboard(motherboard);
                        addedComponents.add(motherboard);
                        System.out.println("Материнську плату успішно додано до комп'ютера!");
                        break;
                    default:
                        System.out.println("Обрано невірний пункт...");
                }
            } else {
                isAssemblingFinished = true;
                System.out.println("Ви завершили збірку комп'ютера...");
                showAddedComponents();
            }
        }
        scanner.close();
    }

    private void showAddedComponents() {
        System.out.println("Компоненти комп'ютера:");
        for (Object currentComponent : addedComponents) {
            System.out.println(currentComponent.toString());
        }
    }

    private void showComponentModels() {
        System.out.println("1: " + new Model1().toString());
        System.out.println("2: " + new Model2().toString());
        System.out.println("3: " + new Model3().toString());
        System.out.println("4: " + new Model4().toString());
        System.out.println("5: " + new Model5().toString());
    }

    private Models choiceComponentModel(int choice) {
        if (choice == 1) {
            return Models.MODEL1;
        } else if (choice == 2) {
            return Models.MODEL2;
        } else if (choice == 3) {
            return Models.MODEL3;
        } else if (choice == 4) {
            return Models.MODEL4;
        } else if (choice == 5) {
            return Models.MODEL5;
        } else {
            System.out.println("Обрано невірний пункт...");
            return null;
        }
    }

    private void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    private void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    private void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    private void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    private void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    private void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    private void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }


}
