package opengl101;

import java.awt.Canvas;
import java.awt.Frame;

import javax.swing.JFrame;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

public class Desenho extends JFrame implements GLEventListener{
	private static final long serialVersionUID = 1L;
	
	final private int width = 800;
	final private int heigth = 600;
	
	public Desenho(){
		super("OpenGL");
		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		GLCanvas canvas = new GLCanvas(capabilities);
		canvas.addGLEventListener(this);
		
		this.setName("OpenGL");
		this.getContentPane().add(canvas);
		
		this.setSize(width, heigth);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		canvas.requestFocusInWindow();
	}
	
	public void play(){
		
	}
	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glClearColor(1.0f, 0.0f, 0.0f, 0.0f);	
		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(1.0f, 0.0f, 0.0f);
			gl.glVertex2f(-0.13f, -0.03f);
			gl.glVertex2f(-0.13f, 0.10f);
			gl.glVertex2f(-0.07f, 0.10f);
			gl.glVertex2f(-0.07f, -0.03f);
			
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2f(-0.12f, -0.03f);
			gl.glVertex2f(-0.12f, 0.04f);
			gl.glVertex2f(-0.08f, 0.04f);
			gl.glVertex2f(-0.08f, -0.03f);
		gl.glEnd();
		gl.glBegin(GL2.GL_TRIANGLES);
			gl.glColor3f(0.0f, 0.0f, 1.0f);
			gl.glVertex2f(-0.13f, 0.10f);
			gl.glVertex2f(-0.10f, 0.16f);
			gl.glVertex2f(-0.07f, 0.10f);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0.0f, 1.0f, 0.0f);
			gl.glVertex2f(-0.10f, 0.16f);
			gl.glVertex2f(0.09f, 0.16f);
			gl.glVertex2f(0.11f, 0.10f);
			gl.glVertex2f(-0.07f,0.10f);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0.20f, 0.70f, 1.25f);
			gl.glVertex2f(-0.07f, -0.03f);
			gl.glVertex2f(0.11f, -0.03f);
			gl.glVertex2f(0.11f, 0.10f);
			gl.glVertex2f(-0.07f,0.10f);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0.20f, 0.0f, 1.25f);
			gl.glVertex2f(-0.05f, 0.03f);
			gl.glVertex2f(-0.05f, 0.07f);
			gl.glVertex2f(-0.01f, 0.07f);
			gl.glVertex2f(-0.01f, 0.03f);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0.20f, 0.0f, 1.25f);
			gl.glVertex2f(0.03f, 0.03f);
			gl.glVertex2f(0.07f, 0.03f);
			gl.glVertex2f(0.07f, 0.07f);
			gl.glVertex2f(0.03f, 0.07f);
		gl.glEnd();
		gl.glFlush();
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
			
	}
	
}

