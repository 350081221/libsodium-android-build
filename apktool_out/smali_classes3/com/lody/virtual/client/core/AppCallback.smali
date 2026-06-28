.class public interface abstract Lcom/lody/virtual/client/core/AppCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EMPTY:Lcom/lody/virtual/client/core/AppCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/core/AppCallback$1;

    invoke-direct {v0}, Lcom/lody/virtual/client/core/AppCallback$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/core/AppCallback;->EMPTY:Lcom/lody/virtual/client/core/AppCallback;

    return-void
.end method


# virtual methods
.method public abstract afterActivityOnCreate(Landroid/app/Activity;)V
.end method

.method public abstract afterActivityOnDestroy(Landroid/app/Activity;)V
.end method

.method public abstract afterActivityOnResume(Landroid/app/Activity;)V
.end method

.method public abstract afterActivityOnStart(Landroid/app/Activity;)V
.end method

.method public abstract afterActivityOnStop(Landroid/app/Activity;)V
.end method

.method public abstract afterApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
.end method

.method public abstract beforeActivityOnCreate(Landroid/app/Activity;)V
.end method

.method public abstract beforeActivityOnDestroy(Landroid/app/Activity;)V
.end method

.method public abstract beforeActivityOnResume(Landroid/app/Activity;)V
.end method

.method public abstract beforeActivityOnStart(Landroid/app/Activity;)V
.end method

.method public abstract beforeActivityOnStop(Landroid/app/Activity;)V
.end method

.method public abstract beforeApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
.end method

.method public abstract beforeStartApplication(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
.end method
