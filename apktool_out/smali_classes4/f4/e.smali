.class public interface abstract annotation Lf4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "P::",
        "Lf4/b<",
        "-TT;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/annotation/Annotation;"
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\u0008\u0087\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0010\u0008\u0001\u0010\u0003*\n\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u00022\u00020\u0004B\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "Lf4/e;",
        "T",
        "Lf4/b;",
        "P",
        "",
        "kotlin-android-extensions-runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation

.annotation runtime Ln3/d;
.end annotation

.annotation runtime Ln3/e;
    value = .enum Ln3/a;->SOURCE:Ln3/a;
.end annotation

.annotation runtime Ln3/f;
    allowedTargets = {
        .enum Ln3/b;->CLASS:Ln3/b;,
        .enum Ln3/b;->PROPERTY:Ln3/b;
    }
.end annotation
