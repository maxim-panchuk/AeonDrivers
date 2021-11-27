package com.backend.aeondrivers.utils.document;

import org.primefaces.model.TreeNode;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author tsypk on 28.11.2021 02:18
 * @project AeonDrivers
 */
@Named("ttContextMenuView")
@ViewScoped
public class ContextMenuView implements Serializable {

    private TreeNode root;

    private TreeNode selectedNode;

    @Inject
    private DocumentService service;

    @PostConstruct
    public void init() {
        root = service.createDocuments();
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setService(DocumentService service) {
        this.service = service;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public void deleteNode() {
        selectedNode.getChildren().clear();
        selectedNode.getParent().getChildren().remove(selectedNode);
        selectedNode.setParent(null);

        selectedNode = null;
    }
}